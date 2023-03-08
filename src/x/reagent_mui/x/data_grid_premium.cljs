(ns reagent-mui.x.data-grid-premium
  "Imports @mui/x-data-grid-premium as a Reagent component.
   Original documentation is at https://mui.com/x/api/data-grid/data-grid-premium/ ."
  (:require-macros [reagent-mui.util :refer [with-unchanged-js-props]])
  (:require [reagent.core :as r]
            ["@mui/x-data-grid-premium" :as MuiDataGridPremium]))

(def data-grid-premium (with-unchanged-js-props (r/adapt-react-class MuiDataGridPremium/DataGridPremium)))
