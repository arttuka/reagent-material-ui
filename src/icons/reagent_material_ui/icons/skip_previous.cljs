(ns reagent-material-ui.icons.skip-previous
  "Imports @material-ui/icons/SkipPrevious as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def skip-previous (create-svg-icon (e "path" #js {"d" "M6 6h2v12H6zm3.5 6 8.5 6V6z"})
                                    "SkipPrevious"))
