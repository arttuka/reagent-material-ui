(ns reagent-mui.base.multi-select-unstyled
  "Imports @mui/base/MultiSelectUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/multi-select-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/MultiSelectUnstyled" :as MuiMultiSelectUnstyled]))

(def multi-select-unstyled (r/adapt-react-class (.-default MuiMultiSelectUnstyled)))
