# AndroidRotateAnimation
## RotateAnimation Test ( other interpolator )

Test Sample
1. linear_interpolator (1000ms ~ 5000ms)
2. accelerate_interpolator (1000ms ~ 5000ms)
3. decelerate_interpolator (1000ms ~ 5000ms)
4. accelerate_decelerate_interpolator (1000ms ~ 5000ms)
5. overshoot_interpolator (1000ms ~ 5000ms)
6. bounce_interpolator (1000ms ~ 5000ms)
7. cycle_interpolator (1000ms ~ 5000ms)
```
android:interpolator= [ interpolator Type ]
android:repeatCount= [ Loop Count ] // dafualt=0, infinite=while
android:duration= [ rotate Time ]
android:pivotX= [ start X pivot point ] // 0% = left top , 100% = right top
android:pivotY= [ start Y pivot point ] // 0% = left top , 100% = left bottom
android:fromDegrees= [Integer]
android:toDegrees= [Integer ]
```

#TEST XML
```
<rotate
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:interpolator="@android:anim/accelerate_decelerate_interpolator"
    android:repeatCount="infinite"
    android:duration="1000"
    android:pivotX="50%"
    android:pivotY="50%"
    android:fromDegrees="0"
    android:toDegrees="360">
</rotate>
```
