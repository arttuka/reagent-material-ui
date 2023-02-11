(ns reagent-mui.x.data-grid
  "Imports @mui/x-data-grid as a Reagent component.
   Original documentation is at https://mui.com/x/api/data-grid/data-grid/ ."
  (:require-macros [reagent-mui.util :refer [with-unchanged-js-props]])
  (:require [reagent.core :as r]
            ["@mui/x-data-grid" :as MuiDataGrid]))

(def data-grid (with-unchanged-js-props (r/adapt-react-class MuiDataGrid/DataGrid)))
