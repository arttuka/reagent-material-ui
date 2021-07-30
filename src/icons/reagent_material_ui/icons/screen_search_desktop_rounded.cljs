(ns reagent-material-ui.icons.screen-search-desktop-rounded
  "Imports @material-ui/icons/ScreenSearchDesktopRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def screen-search-desktop-rounded (create-svg-icon [(e "path" #js {"d" "M22 19H2c-.55 0-1 .45-1 1s.45 1 1 1h20c.55 0 1-.45 1-1s-.45-1-1-1zM4 18h16c1.1 0 1.99-.9 1.99-2L22 5c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v11c0 1.1.9 2 2 2zm4.59-9.95c1.28-1.87 3.86-2.05 5.38-.52 1.18 1.18 1.34 3 .47 4.36L16 13.44c.29.29.29.77 0 1.06-.29.29-.77.29-1.06 0l-1.55-1.55c-1.57 1-3.76.64-4.87-1.11-.73-1.14-.69-2.67.07-3.79z"}) (e "circle" #js {"cx" "11.5", "cy" "10", "r" "2"})]
                                                    "ScreenSearchDesktopRounded"))
