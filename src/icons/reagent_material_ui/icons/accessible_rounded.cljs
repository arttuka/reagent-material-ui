(ns reagent-material-ui.icons.accessible-rounded
  "Imports @material-ui/icons/AccessibleRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def accessible-rounded (create-svg-icon (e react/Fragment nil (e "circle" #js {"cy" "4", "r" "2", "cx" "12"}) (e "path" #js {"d" "M19 11.91c0-.49-.36-.89-.84-.96-2.2-.33-3.46-2.04-4.52-3.2C12.37 6.32 10 7.07 10 9.12V15c0 1.1.9 2 2 2h5v4c0 .55.45 1 1 1s1-.45 1-1v-4.5c0-1.1-.9-2-2-2h-3v-3.45c1 .83 2.41 1.54 3.81 1.82.61.13 1.19-.33 1.19-.96zM12.83 18c-.41 1.16-1.52 2-2.83 2-1.66 0-3-1.34-3-3 0-1.31.84-2.41 2-2.83V12.1c-2.28.46-4 2.48-4 4.9 0 2.76 2.24 5 5 5 2.42 0 4.44-1.72 4.9-4h-2.07z"}))
                                         "AccessibleRounded"))
