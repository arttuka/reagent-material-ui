(ns reagent-mui.x.data-grid-pro
  "Imports @mui/x-data-grid-pro as a Reagent component.
   Original documentation is at https://mui.com/x/api/data-grid/data-grid-pro/ ."
  (:require-macros [reagent-mui.util :refer [with-unchanged-js-props]])
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-data-grid-pro" :as MuiDataGridPro]))

(def data-grid-pro (with-unchanged-js-props (adapt-react-class (.-DataGridPro MuiDataGridPro) "mui-data-grid-pro")))
