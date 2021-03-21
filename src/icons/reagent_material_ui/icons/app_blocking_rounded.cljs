(ns reagent-material-ui.icons.app-blocking-rounded
  "Imports @material-ui/icons/AppBlockingRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def app-blocking-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M14 12c0 2.21 1.79 4 4 4s4-1.79 4-4-1.79-4-4-4-4 1.79-4 4zm4 2.5c-1.38 0-2.5-1.12-2.5-2.5 0-.42.11-.8.29-1.15l3.36 3.36c-.35.18-.73.29-1.15.29zm2.5-2.5c0 .42-.11.8-.29 1.15l-3.36-3.36c.35-.18.73-.29 1.15-.29 1.38 0 2.5 1.12 2.5 2.5z"}) (e "path" #js {"d" "M17 18H7V6h10v1h2V3c0-1.1-.9-2-2-2H7c-1.1 0-2 .9-2 2v18c0 1.1.9 2 2 2h10c1.1 0 2-.9 2-2v-4h-2v1z"}))
                                           "AppBlockingRounded"))
