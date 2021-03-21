(ns reagent-material-ui.icons.crop-rotate-rounded
  "Imports @material-ui/icons/CropRotateRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def crop-rotate-rounded (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M9.45.28c-.4.08-.55.56-.26.84l3.01 3.01c.32.31.85.09.85-.35V2.04c4.45.44 8.06 3.82 8.84 8.17.08.46.5.78.97.78.62 0 1.09-.57.98-1.18C22.61 2.89 15.79-1.12 9.45.28zm2.35 19.59c-.32-.32-.85-.09-.85.35v1.74c-4.45-.44-8.06-3.82-8.84-8.17-.08-.46-.5-.78-.97-.78-.62 0-1.09.57-.98 1.18 1.24 6.92 8.06 10.93 14.4 9.53.39-.09.55-.56.26-.85l-3.02-3zM18 15H9V6c0-.55-.45-1-1-1s-1 .45-1 1v1H6c-.55 0-1 .45-1 1s.45 1 1 1h1v6c0 1.1.9 2 2 2h6v1c0 .55.45 1 1 1s1-.45 1-1v-1h1c.55 0 1-.45 1-1s-.45-1-1-1z"}) (e "path" #js {"d" "M17 13V9c0-1.11-.9-2-2-2h-4v2h4v4h2z"}))
                                          "CropRotateRounded"))
