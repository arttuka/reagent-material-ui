(ns reagent-material-ui.icons.cast-for-education-outlined
  "Imports @material-ui/icons/CastForEducationOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def cast-for-education-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M21 3H3c-1.1 0-2 .9-2 2v3h2V5h18v14h-7v2h7c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zM1 18v3h3c0-1.66-1.34-3-3-3zm0-4v2c2.76 0 5 2.24 5 5h2c0-3.87-3.13-7-7-7zm0-4v2c4.97 0 9 4.03 9 9h2c0-6.08-4.93-11-11-11zm10 1.09v2L14.5 15l3.5-1.91v-2L14.5 13 11 11.09zM14.5 6L9 9l5.5 3L20 9l-5.5-3z"}))
                                                  "CastForEducationOutlined"))
