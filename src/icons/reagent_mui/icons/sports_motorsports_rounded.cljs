(ns reagent-mui.icons.sports-motorsports-rounded
  "Imports @mui/icons-material/SportsMotorsportsRounded as a Reagent component."
  (:require-macros [reagent-mui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@mui/material/SvgIcon" :as SvgIcon]
            [reagent-mui.util]))

(def sports-motorsports-rounded (create-svg-icon [(e "path" #js {"d" "M12 11.39c0-.65-.39-1.23-.98-1.48L5.44 7.55c-1.48 1.68-2.32 3.7-2.8 5.45h7.75c.89 0 1.61-.72 1.61-1.61z"}) (e "path" #js {"d" "M21.96 11.22c-.41-4.41-4.56-7.49-8.98-7.2-2.51.16-4.44.94-5.93 2.04l4.74 2.01c1.33.57 2.2 1.87 2.2 3.32 0 1.99-1.62 3.61-3.61 3.61H2.21C2 16.31 2 17.2 2 17.2v.8c0 1.1.9 2 2 2h10c4.67 0 8.41-4.01 7.96-8.78z"})]
                                                 "SportsMotorsportsRounded"))
