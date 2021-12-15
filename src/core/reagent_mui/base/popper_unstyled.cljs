(ns reagent-mui.base.popper-unstyled
  "Imports @mui/base/PopperUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/popper-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/PopperUnstyled" :as MuiPopperUnstyled]))

(def popper-unstyled (adapt-react-class (.-default MuiPopperUnstyled) "mui-popper-unstyled"))
