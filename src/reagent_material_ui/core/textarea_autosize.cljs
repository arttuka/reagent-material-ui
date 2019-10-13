(ns reagent-material-ui.core.textarea-autosize
  "Imports @material-ui/core/TextareaAutosize as a Reagent component.
   Original documentation is at https://material-ui.com/api/textarea-autosize/ ."
  (:require [reagent.core :as r]
            [material-ui]))

(def textarea-autosize (r/adapt-react-class (.-TextareaAutosize js/MaterialUI)))
