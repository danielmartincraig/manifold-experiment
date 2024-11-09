(ns app.subs
  (:require [re-frame.core :as rf]
            [emmy.env :as emmy]
            [emmy.calculus.manifold :as m]
            ))

(rf/reg-sub :app/todos
  (fn [db _]
    (:todos db)))

(comment 
  (def my-coordinate-system m/R2-rect)
  

  (def my-manifold (m/manifold m/R2-rect))
  

  (def my-manifold-function (m/constant-manifold-function 2))
  

  (def my-manifold-point (m/coords->point my-coordinate-system [1 1]))
  

  (m/manifold-point? my-manifold-point)
  

  (my-manifold-function my-manifold-point)
  )





   