(ns reagent-material-ui.icons.flag-two-tone
  "Imports @material-ui/icons/FlagTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def flag-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M12.36 6H7v6h7.24l.4 2H18V8h-5.24z", "opacity" ".3"}) (e "path" #js {"d" "M14.4 6L14 4H5v17h2v-7h5.6l.4 2h7V6h-5.6zm3.6 8h-3.36l-.4-2H7V6h5.36l.4 2H18v6z"}))
                                    "FlagTwoTone"))
