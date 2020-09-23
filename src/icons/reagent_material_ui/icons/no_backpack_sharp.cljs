(ns reagent-material-ui.icons.no-backpack-sharp
  "Imports @material-ui/icons/NoBackpackSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def no-backpack-sharp (create-svg-icon (e "path" #js {"d" "M21.19 21.19L2.81 2.81 1.39 4.22l2.76 2.76C4.06 7.31 4 7.64 4 8v14h15.17l.61.61 1.41-1.42zM6 14v-2h3.17l2 2H6zm.98-9.85c.01 0 .01-.01.02-.01V2h3v2h4V2h3v2.14c1.72.45 3 2 3 3.86v9.17l-2-2V12h-3.17L6.98 4.15z"})
                                        "NoBackpackSharp"))
