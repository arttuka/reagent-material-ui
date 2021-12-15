(ns reagent-mui.base.backdrop-unstyled
  "Imports @mui/base/BackdropUnstyled as a Reagent component.
   Original documentation is at https://mui.com/api/backdrop-unstyled/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/base/BackdropUnstyled" :as MuiBackdropUnstyled]))

(def backdrop-unstyled (adapt-react-class (.-default MuiBackdropUnstyled) "mui-backdrop-unstyled"))
