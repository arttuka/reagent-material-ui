(ns reagent-material-ui.icons.lte-plus-mobiledata-rounded
  "Imports @material-ui/icons/LtePlusMobiledataRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def lte-plus-mobiledata-rounded (create-svg-icon (e "path" #js {"d" "M3 14h2c.55 0 1 .45 1 1s-.45 1-1 1H2c-.55 0-1-.45-1-1V9c0-.55.45-1 1-1s1 .45 1 1v5zm3-4h1v5c0 .55.45 1 1 1s1-.45 1-1v-5h1c.55 0 1-.45 1-1s-.45-1-1-1H6c-.55 0-1 .45-1 1s.45 1 1 1zm7 6h3c.55 0 1-.45 1-1s-.45-1-1-1h-2v-1h2c.55 0 1-.45 1-1s-.45-1-1-1h-2v-1h2c.55 0 1-.45 1-1s-.45-1-1-1h-3c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1zm10-5h-1v-1c0-.55-.45-1-1-1s-1 .45-1 1v1h-1c-.55 0-1 .45-1 1s.45 1 1 1h1v1c0 .55.45 1 1 1s1-.45 1-1v-1h1c.55 0 1-.45 1-1s-.45-1-1-1z"})
                                                  "LtePlusMobiledataRounded"))
