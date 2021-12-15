(ns reagent-mui.x.data-grid-pro
  "Imports @mui/x-data-grid-pro as a Reagent component.
  Original documentation is at https://mui.com/components/data-grid/ ."
  (:require-macros [reagent-mui.util :refer [with-unchanged-js-props]])
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-data-grid-pro" :as DataGridPro]))

(def data-grid-pro (with-unchanged-js-props (adapt-react-class (.-DataGridPro DataGridPro) "mui-data-grid-pro")))
