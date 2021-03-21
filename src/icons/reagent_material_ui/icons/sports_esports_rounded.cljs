(ns reagent-material-ui.icons.sports-esports-rounded
  "Imports @material-ui/icons/SportsEsportsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sports-esports-rounded (create-svg-icon (e "path" #js {"d" "M21.97 15.94l-1.07-7.5C20.62 6.46 18.93 5 16.93 5H7.06c-2 0-3.69 1.46-3.97 3.44l-1.07 7.49c-.21 1.55.93 3.06 2.5 3.07.68 0 1.33-.27 1.81-.75L8.6 16h6.8l2.25 2.25c.84.84 2.2 1.04 3.27.28.82-.58 1.19-1.61 1.05-2.59zm-11.72-4.69h-1v1c0 .41-.34.75-.75.75s-.75-.34-.75-.75v-1h-1c-.41 0-.75-.34-.75-.75s.34-.75.75-.75h1v-1c0-.41.34-.75.75-.75s.75.34.75.75v1h1c.41 0 .75.34.75.75s-.34.75-.75.75zM15 10c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1zm2 3c-.55 0-1-.45-1-1s.45-1 1-1 1 .45 1 1-.45 1-1 1z"})
                                             "SportsEsportsRounded"))
