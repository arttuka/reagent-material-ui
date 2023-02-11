(ns reagent-mui.base.input-unstyled
  "Imports @mui/base/InputUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/input-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/InputUnstyled" :as MuiInputUnstyled]))

(def input-unstyled (r/adapt-react-class (.-default MuiInputUnstyled)))
