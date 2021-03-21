(ns reagent-material-ui.icons.gavel
  "Imports @material-ui/icons/Gavel as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def gavel (create-svg-icon (e "path" #js {"d" "M5.2494 8.0688l2.83-2.8269 14.1343 14.15-2.83 2.8269zm4.2363-4.2415l2.828-2.8289 5.6577 5.656-2.828 2.8289zM.9989 12.3147l2.8284-2.8285 5.6569 5.6569-2.8285 2.8284zM1 21h12v2H1z"})
                            "Gavel"))
