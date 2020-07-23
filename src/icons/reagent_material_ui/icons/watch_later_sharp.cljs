(ns reagent-material-ui.icons.watch-later-sharp
  "Imports @material-ui/icons/WatchLaterSharp as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def watch-later-sharp (create-svg-icon (e "path" #js {"d" "M12 2C6.5 2 2 6.5 2 12s4.5 10 10 10 10-4.5 10-10S17.5 2 12 2zm4.2 14.2L11 13V7h1.5v5.2l4.5 2.7-.8 1.3z"})
                                        "WatchLaterSharp"))
