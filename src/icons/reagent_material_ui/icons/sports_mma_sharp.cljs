(ns reagent-material-ui.icons.sports-mma-sharp
  "Imports @material-ui/icons/SportsMmaSharp as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sports-mma-sharp (create-svg-icon (e "path" #js {"d" "M7 17h10v4H7zM18 7c-.55 0-1 .45-1 1V5c0-1.1-.9-2-2-2H7c-1.1 0-2 .9-2 2v5.8c0 .13.01.26.04.39l.8 4c.09.47.5.8.98.8h10.36c.45 0 .89-.36.98-.8l.8-4c.03-.13.04-.26.04-.39V8c0-.55-.45-1-1-1zm-3 3H7V7h8v3z"})
                                       "SportsMmaSharp"))
