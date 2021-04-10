(ns reagent-material-ui.icons.remove
  "Imports @material-ui/icons/Remove as a Reagent component."
  (:refer-clojure :exclude [remove])
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def remove (create-svg-icon (e "path" #js {"d" "M19 13H5v-2h14v2z"})
                             "Remove"))
