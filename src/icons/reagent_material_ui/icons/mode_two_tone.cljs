(ns reagent-material-ui.icons.mode-two-tone
  "Imports @material-ui/icons/ModeTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def mode-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M14.06 9.02L5 18.08V19h.92l9.06-9.06z", "opacity" ".3"}) (e "path" #js {"d" "M18.37 3.29c-.2-.2-.45-.29-.71-.29s-.51.1-.7.29l-1.83 1.83 3.75 3.75 1.83-1.83c.39-.39.39-1.02 0-1.41l-2.34-2.34zm-.56 6.65l-3.75-3.75L3 17.25V21h3.75L17.81 9.94zM5 19v-.92l9.06-9.06.92.92L5.92 19H5z"}))
                                    "ModeTwoTone"))
