(ns reagent-material-ui.icons.imagesearch-roller
  "Imports @material-ui/icons/ImagesearchRoller as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def imagesearch-roller (create-svg-icon (e "path" #js {"d" "M20 2v6H6V6H4v4h10v5h2v8h-6v-8h2v-3H2V4h4V2"})
                                         "ImagesearchRoller"))
