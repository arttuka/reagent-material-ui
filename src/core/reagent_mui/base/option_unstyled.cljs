(ns reagent-mui.base.option-unstyled
  "Imports @mui/base/OptionUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/option-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/OptionUnstyled" :as MuiOptionUnstyled]))

(def option-unstyled (adapt-react-class (.-default MuiOptionUnstyled) "mui-option-unstyled"))
