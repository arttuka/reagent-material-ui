(ns reagent-mui.base.select-unstyled
  "Imports @mui/base/SelectUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/select-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/SelectUnstyled" :as MuiSelectUnstyled]))

(def select-unstyled (r/adapt-react-class (.-default MuiSelectUnstyled)))
