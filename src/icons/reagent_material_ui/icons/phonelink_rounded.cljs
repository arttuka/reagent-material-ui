(ns reagent-material-ui.icons.phonelink-rounded
  "Imports @material-ui/icons/PhonelinkRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def phonelink-rounded (create-svg-icon (e "path" #js {"d" "M6 6h14c.55 0 1-.45 1-1s-.45-1-1-1H6c-1.1 0-2 .9-2 2v11h-.5c-.83 0-1.5.67-1.5 1.5S2.67 20 3.5 20h7c.83 0 1.5-.67 1.5-1.5s-.67-1.5-1.5-1.5H6V6zm15 2h-6c-.55 0-1 .45-1 1v10c0 .55.45 1 1 1h6c.55 0 1-.45 1-1V9c0-.55-.45-1-1-1zm-1 9h-4v-7h4v7z"})
                                        "PhonelinkRounded"))
