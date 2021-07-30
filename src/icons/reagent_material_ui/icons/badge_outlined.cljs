(ns reagent-material-ui.icons.badge-outlined
  "Imports @material-ui/icons/BadgeOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def badge-outlined (create-svg-icon [(e "path" #js {"d" "M14 12h4v1.5h-4zm0 3h4v1.5h-4z"}) (e "path" #js {"d" "M20 7h-5V4c0-1.1-.9-2-2-2h-2c-1.1 0-2 .9-2 2v3H4c-1.1 0-2 .9-2 2v11c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V9c0-1.1-.9-2-2-2zm-9 0V4h2v5h-2V7zm9 13H4V9h5c0 1.1.9 2 2 2h2c1.1 0 2-.9 2-2h5v11z"}) (e "circle" #js {"cx" "9", "cy" "13.5", "r" "1.5"}) (e "path" #js {"d" "M11.08 16.18c-.64-.28-1.34-.43-2.08-.43s-1.44.15-2.08.43c-.56.24-.92.78-.92 1.39V18h6v-.43c0-.61-.36-1.15-.92-1.39z"})]
                                     "BadgeOutlined"))
