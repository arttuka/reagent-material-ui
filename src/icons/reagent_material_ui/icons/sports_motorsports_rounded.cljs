(ns reagent-material-ui.icons.sports-motorsports-rounded
  "Imports @material-ui/icons/SportsMotorsportsRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def sports-motorsports-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M10.42 13c.87 0 1.58-.71 1.58-1.58 0-.65-.39-1.22-.99-1.47l-5.77-2.3c-1.4 1.47-2.42 3.3-2.9 5.35h8.08z"}) (e "path" #js {"d" "M21.92 10.84C21.36 6.85 17.75 4 13.73 4c-2.53 0-4.87.81-6.79 2.18l4.82 1.92c1.35.54 2.24 1.86 2.24 3.32C14 13.4 12.4 15 10.42 15H2.04c-.02.24-.04.48-.04.73V18c0 1.1.9 2 2 2h10c4.8 0 8.61-4.23 7.92-9.16z"}))
                                                 "SportsMotorsportsRounded"))
