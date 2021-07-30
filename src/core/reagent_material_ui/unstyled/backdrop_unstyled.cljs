(ns reagent-material-ui.unstyled.backdrop-unstyled
  "Imports @material-ui/unstyled/BackdropUnstyled as a Reagent component.
   Original documentation is at https://material-ui.com/api/backdrop-unstyled/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            ["@material-ui/unstyled/BackdropUnstyled" :as MuiBackdropUnstyled]))

(def backdrop-unstyled (adapt-react-class (.-default MuiBackdropUnstyled) "mui-backdrop-unstyled"))
