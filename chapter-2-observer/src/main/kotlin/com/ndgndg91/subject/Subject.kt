package com.ndgndg91.subject

import com.ndgndg91.observer.Observer

interface Subject {
    /**
     * 옵저버 등록
     */
    fun registerObserver(observer: Observer)

    /**
     * 옵저버 제거
     */
    fun removeObserver(observer: Observer)

    /**
     * 주제의 상태가 변경되었을 때 모든 옵저버에게 변경 내용을 알리려고 호출
     */
    fun notifyObservers()
}