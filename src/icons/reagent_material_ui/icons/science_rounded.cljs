(ns reagent-material-ui.icons.science-rounded
  "Imports @material-ui/icons/ScienceRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def science-rounded (create-svg-icon (e "path" #js {"d" "M20.54 17.73L15 11V5h1c.55 0 1-.45 1-1s-.45-1-1-1H8c-.55 0-1 .45-1 1s.45 1 1 1h1v6l-5.54 6.73c-.32.39-.46.83-.46 1.27.01 1.03.82 2 2 2h14c1.19 0 2-.97 2-2 0-.44-.14-.88-.46-1.27z"})
                                      "ScienceRounded"))
