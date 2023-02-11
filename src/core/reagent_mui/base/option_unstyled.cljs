(ns reagent-mui.base.option-unstyled
  "Imports @mui/base/OptionUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/option-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/OptionUnstyled" :as MuiOptionUnstyled]))

(def option-unstyled (r/adapt-react-class (.-default MuiOptionUnstyled)))
