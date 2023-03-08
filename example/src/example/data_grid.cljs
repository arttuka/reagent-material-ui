(ns example.data-grid
  (:require [reagent.core :as r]
            [reagent-mui.x.data-grid :refer [data-grid]]
            [reagent-mui.util :refer [clj->js' wrap-clj-function]]))

(def columns [{:field      :id
               :headerName "ID"
               :width      90}
              {:field      :first-name
               :headerName "First name"
               :width      150
               :editable   true}
              {:field      :last-name
               :headerName "Last name"
               :width      150
               :editable   true}
              {:field      :age
               :headerName "Age"
               :type       :number
               :width      110
               :editable   true}
              {:field       :full-name
               :headerName  "Full name"
               :description "This column has a value getter and is not sortable."
               :sortable    false
               :width       160
               :valueGetter (wrap-clj-function
                             (fn [params]
                               (str (get-in params [:row :first-name] "") " " (get-in params [:row :last-name] ""))))}])

(def rows [{:id 1 :last-name "Snow" :first-name "Jon" :age 35}
           {:id 2 :last-name "Lannister" :first-name "Cersei" :age 42}
           {:id 3 :last-name "Lannister" :first-name "Jaime" :age 45}
           {:id 4 :last-name "Stark" :first-name "Arya" :age 16}
           {:id 5 :last-name "Targaryen" :first-name "Daenerys" :age nil}
           {:id 6 :last-name "Melisandre" :first-name nil :age 150}
           {:id 7 :last-name "Clifford" :first-name "Ferrara" :age 44}
           {:id 8 :last-name "Frances" :first-name "Rossini" :age 36}
           {:id 9 :last-name "Roxie" :first-name "Harvey" :age 65}])

(defn component []
  [:div {:style {:height 400 :width 800}}
   [data-grid {:rows                           rows
               :columns                        columns
               :initial-state                  (clj->js' {:pagination {:pagination-model {:page-size 5}}})
               :page-size-options              [5]
               :checkbox-selection             true
               :disable-row-selection-on-click true}]])