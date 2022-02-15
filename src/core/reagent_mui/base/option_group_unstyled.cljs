(ns reagent-mui.base.option-group-unstyled
  "Imports @mui/base/OptionGroupUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/option-group-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/OptionGroupUnstyled" :as MuiOptionGroupUnstyled]))

(def option-group-unstyled (adapt-react-class (.-default MuiOptionGroupUnstyled) "mui-option-group-unstyled"))
