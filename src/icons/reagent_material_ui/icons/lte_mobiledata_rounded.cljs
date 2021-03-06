(ns reagent-material-ui.icons.lte-mobiledata-rounded
  "Imports @material-ui/icons/LteMobiledataRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def lte-mobiledata-rounded (create-svg-icon (e "path" #js {"d" "M6 14h2c.55 0 1 .45 1 1s-.45 1-1 1H5c-.55 0-1-.45-1-1V9c0-.55.45-1 1-1s1 .45 1 1v5zm4-4h1v5c0 .55.45 1 1 1s1-.45 1-1v-5h1c.55 0 1-.45 1-1s-.45-1-1-1h-4c-.55 0-1 .45-1 1s.45 1 1 1zm11-1c0-.55-.45-1-1-1h-3c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1h3c.55 0 1-.45 1-1s-.45-1-1-1h-2v-1h2c.55 0 1-.45 1-1s-.45-1-1-1h-2v-1h2c.55 0 1-.45 1-1z"})
                                             "LteMobiledataRounded"))
