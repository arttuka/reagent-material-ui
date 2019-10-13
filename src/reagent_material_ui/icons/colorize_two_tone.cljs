(ns reagent-material-ui.icons.colorize-two-tone
  "Imports @material-ui/icons/ColorizeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def colorize-two-tone (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M15.896 9.023l-.92-.92L17.67 5.41l.92.92z", "opacity" ".3"}) (e "path" #js {"d" "M20.71 5.63l-2.34-2.34c-.2-.2-.45-.29-.71-.29s-.51.1-.7.29l-3.12 3.12-1.93-1.91-1.41 1.41 1.42 1.42L3 16.25V21h4.75l8.92-8.92 1.42 1.42 1.41-1.41-1.92-1.92 3.12-3.12c.4-.4.4-1.03.01-1.42zM6.92 19L5 17.08l8.06-8.06 1.92 1.92L6.92 19zm8.98-9.97l-.93-.93 2.69-2.69.92.92-2.68 2.7z"}))
                                        "ColorizeTwoTone"))
