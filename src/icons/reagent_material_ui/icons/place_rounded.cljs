(ns reagent-material-ui.icons.place-rounded
  "Imports @material-ui/icons/PlaceRounded as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def place-rounded (create-svg-icon (e "path" #js {"d" "M12 12c1.1 0 2-.9 2-2s-.9-2-2-2-2 .9-2 2 .9 2 2 2zm0-10c4.2 0 8 3.22 8 8.2 0 3.18-2.45 6.92-7.34 11.23-.38.33-.95.33-1.33 0C6.45 17.12 4 13.38 4 10.2 4 5.22 7.8 2 12 2z"})
                                    "PlaceRounded"))
