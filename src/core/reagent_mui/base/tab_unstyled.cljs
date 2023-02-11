(ns reagent-mui.base.tab-unstyled
  "Imports @mui/base/TabUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/tab-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/TabUnstyled" :as MuiTabUnstyled]))

(def tab-unstyled (r/adapt-react-class (.-default MuiTabUnstyled)))
