(ns reagent-material-ui.icons.savings-sharp
  "Imports @material-ui/icons/SavingsSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def savings-sharp (create-svg-icon (e "path" #js {"d" "m19.83 7.5-2.27-2.27c.07-.42.18-.81.32-1.15.23-.56.56-1.06.97-1.5-.7-.37-1.5-.58-2.35-.58-1.64 0-3.09.79-4 2h-5C4.46 4 2 6.46 2 9.5S4.5 21 4.5 21H10v-2h2v2h5.5l1.68-5.59 2.82-.94V7.5h-2.17zM13 9H8V7h5v2zm3 2c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"})
                                    "SavingsSharp"))
