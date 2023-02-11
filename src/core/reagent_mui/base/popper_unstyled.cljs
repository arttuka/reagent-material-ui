(ns reagent-mui.base.popper-unstyled
  "Imports @mui/base/PopperUnstyled as a Reagent component.
   Original documentation is at https://mui.com/base/api/popper-unstyled/ ."
  (:require [reagent.core :as r]
            ["@mui/base/PopperUnstyled" :as MuiPopperUnstyled]))

(def popper-unstyled (r/adapt-react-class (.-default MuiPopperUnstyled)))
