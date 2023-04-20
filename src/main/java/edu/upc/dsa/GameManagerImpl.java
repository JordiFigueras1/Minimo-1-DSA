package edu.upc.dsa;

import edu.upc.dsa.models.Exceptions.PartidaEnActivoException;
import edu.upc.dsa.models.Exceptions.PlayerCurrentlyPlayingException;
import edu.upc.dsa.models.Exceptions.PlayerDoesNotExistException;
import edu.upc.dsa.models.Exceptions.PlayerNotCurrentlyPlayingException;
import edu.upc.dsa.models.Partida;

import java.util.*;

import org.apache.log4j.Logger;

import static java.lang.Integer.parseInt;
import static java.util.stream.Collectors.toList;

