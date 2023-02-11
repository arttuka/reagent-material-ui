(ns reagent-mui.base.option-group-unstyled
  "Imports @mui/base/OptionGroupUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/option-group-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/OptionGroupUnstyled" :as MuiOptionGroupUnstyled]))

(def option-group-unstyled (r/adapt-react-class (.-default MuiOptionGroupUnstyled)))
