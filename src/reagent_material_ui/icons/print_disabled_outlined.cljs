(ns reagent-material-ui.icons.print-disabled-outlined
  "Imports @material-ui/icons/PrintDisabledOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def print-disabled-outlined (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M1.41 1.6L0 3.01 5 8c-1.66 0-3 1.34-3 3v6h4v4h12l2.95 2.96 1.41-1.41L1.41 1.6zM6 15H4v-4c0-.55.45-1 1-1h2l3 3H6v2zm2 4v-4h4l4 4H8zM8 5h8v3h-5.34l2 2H19c.55 0 1 .45 1 1v4l-2 .01V13h-2.34l4 4H22v-6c0-1.66-1.34-3-3-3h-1V3H6v.36l2 2V5z"}) (e "circle" #js {"cy" "11.51", "r" "1", "cx" "18"}))
                                              "PrintDisabledOutlined"))
