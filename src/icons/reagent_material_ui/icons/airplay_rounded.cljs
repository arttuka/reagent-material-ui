(ns reagent-material-ui.icons.airplay-rounded
  "Imports @material-ui/icons/AirplayRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def airplay-rounded (create-svg-icon (e "path" #js {"d" "M8.41 21h7.17c.89 0 1.34-1.08.71-1.71L12.7 15.7a.9959.9959 0 0 0-1.41 0L7.7 19.29c-.62.63-.18 1.71.71 1.71zM20 3H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h2c.55 0 1-.45 1-1s-.45-1-1-1H4V5h16v12h-2c-.55 0-1 .45-1 1s.45 1 1 1h2c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2z"})
                                      "AirplayRounded"))
