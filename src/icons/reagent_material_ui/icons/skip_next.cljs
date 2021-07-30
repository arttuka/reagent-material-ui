(ns reagent-material-ui.icons.skip-next
  "Imports @material-ui/icons/SkipNext as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def skip-next (create-svg-icon (e "path" #js {"d" "m6 18 8.5-6L6 6v12zM16 6v12h2V6h-2z"})
                                "SkipNext"))
