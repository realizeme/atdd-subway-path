package nextstep.subway.paths.dto;

import nextstep.subway.station.dto.StationResponse;

import java.time.LocalDateTime;
import java.util.List;

public class PathResponse {
    private List<PathStationResponse> stations;
    private int distance;

    public PathResponse() {}

    public PathResponse(List< PathStationResponse > stations, int distance){
        this.stations = stations;
        this.distance = distance;
    }

    public List< PathStationResponse > getStations() {
        return stations;
    }

    public int getDistance() {
        return distance;
    }
}
