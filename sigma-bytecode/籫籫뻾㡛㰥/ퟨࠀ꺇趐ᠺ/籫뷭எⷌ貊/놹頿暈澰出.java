public class \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ub1b9\u983f\uf9c5\u6fb0\u51fa {
    public void \ub1b9\u983f\uf9c5\u6fb0\u51fa(com.mojang.authlib.GameProfileRepository p0, java.io.File p1) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokespecial:Object(Object::<init>, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa)
            putfield:Map<String, \u5bc4\uc246\ud7e8\u5db4\u8709>(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u446c\ud51e\u836c\u6b0d\u8413\u8c8a, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa, invokestatic:ConcurrentMap[expected:Map<String, \u5bc4\uc246\ud7e8\u5db4\u8709>](Maps::newConcurrentMap))
            putfield:Map<UUID, \u5bc4\uc246\ud7e8\u5db4\u8709>(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\uc84e\u7006\u3711\u516c\u718f\u56bd, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa, invokestatic:ConcurrentMap[expected:Map<UUID, \u5bc4\uc246\ud7e8\u5db4\u8709>](Maps::newConcurrentMap))
            putfield:Gson(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u2dcc\ucfaf\u516c\uc29a\u965f\u8413, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa, invokevirtual:Gson(GsonBuilder::create, initobject:GsonBuilder(GsonBuilder::<init>)))
            putfield:AtomicLong(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u71ae\u16f6\u6d69\uc238\u56bd\u1833, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa, initobject:AtomicLong(AtomicLong::<init>))
            putfield:GameProfileRepository(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u946b\u494c\uc87f\ub32d\u8c8a\u98a4, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa, p0:GameProfileRepository)
            putfield:File(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\uf9c5\u983f\u8308\ud4fe\u7c6b\uae5d, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa, p1:File)
            invokeinterface:void(Iterable::forEach, invokestatic:List[expected:Iterable](Lists::reverse, invokevirtual:List<\u5bc4\uc246\ud7e8\u5db4\u8709>(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u6b5f\ucb79\u4cd9\ube23\u8d98\u416d, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa)), invokedynamic:Consumer<\u5bc4\uc246\ud7e8\u5db4\u8709>(accept:(L\u7c6b\u7c6b\ubefe\u385b\u3c25/\ud7e8\u0800\uae87\u8d90\u183a/\u7c6b\ubded\u0b8e\u2dcc\u8c8a/\ub1b9\u983f\uf9c5\u6fb0\u51fa;)Ljava/util/function/Consumer;, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u9af2\ube23\u516c\u3d4b\u98a4\ud7e8(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u5bc4\uc246\ud7e8\u5db4\u8709 p0) {
        var_4_64 : GameProfile
        var_5_73 : String
        var_6_84 : UUID
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_64 = invokevirtual:GameProfile(\u5bc4\uc246\ud7e8\u5db4\u8709::\u1833\ubefe\u983f\ub70c\u67e9\u71ae, p0:\u5bc4\uc246\ud7e8\u5db4\u8709)
            invokevirtual:void(\u5bc4\uc246\ud7e8\u5db4\u8709::\u9af2\u183a\u74b1\u983f\uc2bd\ubefe, p0:\u5bc4\uc246\ud7e8\u5db4\u8709, invokespecial:long(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u8bb0\ub7dc\uf9c5\u92ff\u3d4b\u7ce1, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa))
            var_5_73 = invokevirtual:String(GameProfile::getName, var_4_64:GameProfile)
            
            if (cmpne:boolean(var_5_73:String, aconstnull:String())) {
                invokeinterface:\u5bc4\uc246\ud7e8\u5db4\u8709(Map<String, \u5bc4\uc246\ud7e8\u5db4\u8709>::put, getfield:Map<String, \u5bc4\uc246\ud7e8\u5db4\u8709>(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u446c\ud51e\u836c\u6b0d\u8413\u8c8a, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa), invokevirtual:String(String::toLowerCase, var_5_73:String, getstatic:Locale(Locale::ROOT)), p0:\u5bc4\uc246\ud7e8\u5db4\u8709)
            }
            
            var_6_84 = invokevirtual:UUID(GameProfile::getId, var_4_64:GameProfile)
            
            if (cmpne:boolean(var_6_84:UUID, aconstnull:UUID())) {
                invokeinterface:\u5bc4\uc246\ud7e8\u5db4\u8709(Map<UUID, \u5bc4\uc246\ud7e8\u5db4\u8709>::put, getfield:Map<UUID, \u5bc4\uc246\ud7e8\u5db4\u8709>(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\uc84e\u7006\u3711\u516c\u718f\u56bd, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa), var_6_84:UUID, p0:\u5bc4\uc246\ud7e8\u5db4\u8709)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static com.mojang.authlib.GameProfile \u0a06\u8d90\ub70c\u494c\u67e9\u67e9(com.mojang.authlib.GameProfileRepository p0, java.lang.String p1) {
        var_4_67 : AtomicReference<GameProfile>
        var_5_72 : \u4975\u7c6b\u0a06\u51b2\u76bc
        expr_7C : String[] [generated]
        var_6_9B : GameProfile
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_67 = initobject:AtomicReference<GameProfile>(AtomicReference<V>::<init>)
            var_5_72 = initobject:\u4975\u7c6b\u0a06\u51b2\u76bc(\u4975\u7c6b\u0a06\u51b2\u76bc::<init>, var_4_67:AtomicReference<GameProfile>)
            expr_7C = newarray:String[](java.lang.String.class, xor:int(ldc:int(68), ldc:int(69)))
            storeelement:String(expr_7C:String[], and:int(ldc:int(21121), ldc:int(-21122)), p1:String)
            invokeinterface:void(GameProfileRepository::findProfilesByNames, p0:GameProfileRepository, expr_7C:String[], getstatic:Agent(Agent::MINECRAFT), var_5_72:ProfileLookupCallback)
            var_6_9B = checkcast:GameProfile(com.mojang.authlib.GameProfile.class, invokevirtual:GameProfile(AtomicReference<GameProfile>::get, var_4_67:AtomicReference<GameProfile>))
            
            if (logicalnot:boolean(invokestatic:boolean(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u3bc9\u74b1\u120d\ufcaf\u7006\u6cfe))) {
                if (cmpeq:boolean(var_6_9B:GameProfile, aconstnull:GameProfile())) {
                    var_6_9B = initobject:GameProfile(GameProfile::<init>, invokestatic:UUID(\ua3b4\u8aa5\ub113\ubf56\u873d::\ub7dc\ub83f\u0c95\ub83f\u8bb0\u516c, initobject:GameProfile(GameProfile::<init>, checkcast:UUID(java.util.UUID.class, aconstnull:UUID()), p1:String)), p1:String)
                }
            }
            
            return:GameProfile(var_6_9B:GameProfile)
        }
        
        goto(Label_0006)
    }
    
    public static void \ua562\u8350\u7ce1\u4c04\u36d3\ud217(boolean p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            putstatic:boolean(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u5140\uc2bd\ud51e\u4975\u88c5\u3d64, p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u3bc9\u74b1\u120d\ufcaf\u7006\u6cfe() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:boolean(getstatic:boolean(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u5140\uc2bd\ud51e\u4975\u88c5\u3d64))
        }
        
        goto(Label_0006)
    }
    
    public void \u12cb\u99f7\u8c8a\u183a\u600f\ub6ab(com.mojang.authlib.GameProfile p0) {
        var_4_63 : Calendar
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_63 = invokestatic:Calendar(Calendar::getInstance)
            invokevirtual:void(Calendar::setTime, var_4_63:Calendar, initobject:Date(Date::<init>))
            invokevirtual:void(Calendar::add, var_4_63:Calendar, xor:int(ldc:int(1088), ldc:int(1090)), xor:int(ldc:int(-28128), ldc:int(-28127)))
            invokespecial:void(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u9af2\ube23\u516c\u3d4b\u98a4\ud7e8, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa, initobject:\u5bc4\uc246\ud7e8\u5db4\u8709(\u5bc4\uc246\ud7e8\u5db4\u8709::<init>, p0:GameProfile, invokevirtual:Date(Calendar::getTime, var_4_63:Calendar), aconstnull:\u4975\u7c6b\u0a06\u51b2\u76bc()))
            invokevirtual:void(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\ub1b9\u8d98\u8308\ube23\u1187\u946b, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private long \u8bb0\ub7dc\uf9c5\u92ff\u3d4b\u7ce1() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:long(invokevirtual:long(AtomicLong::incrementAndGet, getfield:AtomicLong(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u71ae\u16f6\u6d69\uc238\u56bd\u1833, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa)))
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.authlib.GameProfile \u3dd3\u98a4\ud7e8\u34df\u873d\u6bb9(java.lang.String p0) {
        var_4_69 : String
        var_5_79 : \u5bc4\uc246\ud7e8\u5db4\u8709
        var_6_82 : int
        var_7_97 : GameProfile
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_69 = invokevirtual:String(String::toLowerCase, p0:String, getstatic:Locale(Locale::ROOT))
            var_5_79 = checkcast:\u5bc4\uc246\ud7e8\u5db4\u8709(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u5bc4\uc246\ud7e8\u5db4\u8709.class, invokeinterface:\u5bc4\uc246\ud7e8\u5db4\u8709(Map<String, \u5bc4\uc246\ud7e8\u5db4\u8709>::get, getfield:Map<String, \u5bc4\uc246\ud7e8\u5db4\u8709>(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u446c\ud51e\u836c\u6b0d\u8413\u8c8a, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa), var_4_69:String[expected:Object]))
            var_6_82 = and:int(ldc:int(-18287), ldc:int(17704))
            
            if (cmpne:boolean(var_5_79:\u5bc4\uc246\ud7e8\u5db4\u8709, aconstnull:\u5bc4\uc246\ud7e8\u5db4\u8709())) {
                if (cmpge:boolean(invokevirtual:long(Date::getTime, initobject:Date(Date::<init>)), invokevirtual:long(Date::getTime, invokestatic:Date(\u5bc4\uc246\ud7e8\u5db4\u8709::\uc2bd\ud51e\ud51e\u64f2\u6198\ua6bd, var_5_79:\u5bc4\uc246\ud7e8\u5db4\u8709)))) {
                    invokeinterface:\u5bc4\uc246\ud7e8\u5db4\u8709(Map<UUID, \u5bc4\uc246\ud7e8\u5db4\u8709>::remove, getfield:Map<UUID, \u5bc4\uc246\ud7e8\u5db4\u8709>(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\uc84e\u7006\u3711\u516c\u718f\u56bd, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa), invokevirtual:UUID(GameProfile::getId, invokevirtual:GameProfile(\u5bc4\uc246\ud7e8\u5db4\u8709::\u1833\ubefe\u983f\ub70c\u67e9\u71ae, var_5_79:\u5bc4\uc246\ud7e8\u5db4\u8709)))
                    invokeinterface:\u5bc4\uc246\ud7e8\u5db4\u8709(Map<String, \u5bc4\uc246\ud7e8\u5db4\u8709>::remove, getfield:Map<String, \u5bc4\uc246\ud7e8\u5db4\u8709>(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u446c\ud51e\u836c\u6b0d\u8413\u8c8a, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa), invokevirtual:String(String::toLowerCase, invokevirtual:String(GameProfile::getName, invokevirtual:GameProfile(\u5bc4\uc246\ud7e8\u5db4\u8709::\u1833\ubefe\u983f\ub70c\u67e9\u71ae, var_5_79:\u5bc4\uc246\ud7e8\u5db4\u8709)), getstatic:Locale(Locale::ROOT)))
                    var_6_82 = and:int(ldc:int(6181), ldc:int(1025))
                    var_5_79 = aconstnull:\u5bc4\uc246\ud7e8\u5db4\u8709()
                }
            }
            
            if (cmpeq:boolean(var_5_79:\u5bc4\uc246\ud7e8\u5db4\u8709, aconstnull:\u5bc4\uc246\ud7e8\u5db4\u8709())) {
                var_7_97 = invokestatic:GameProfile(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u0a06\u8d90\ub70c\u494c\u67e9\u67e9, getfield:GameProfileRepository(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u946b\u494c\uc87f\ub32d\u8c8a\u98a4, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa), var_4_69:String)
                
                if (cmpne:boolean(var_7_97:GameProfile, aconstnull:GameProfile())) {
                    invokevirtual:void(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u12cb\u99f7\u8c8a\u183a\u600f\ub6ab, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa, var_7_97:GameProfile)
                    var_6_82 = and:int(ldc:int(2268), ldc:int(-3294))
                }
            }
            else {
                invokevirtual:void(\u5bc4\uc246\ud7e8\u5db4\u8709::\u9af2\u183a\u74b1\u983f\uc2bd\ubefe, var_5_79:\u5bc4\uc246\ud7e8\u5db4\u8709, invokespecial:long(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u8bb0\ub7dc\uf9c5\u92ff\u3d4b\u7ce1, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa))
                var_7_97 = invokevirtual:GameProfile(\u5bc4\uc246\ud7e8\u5db4\u8709::\u1833\ubefe\u983f\ub70c\u67e9\u71ae, var_5_79:\u5bc4\uc246\ud7e8\u5db4\u8709)
            }
            
            if (cmpne:boolean(var_6_82:int, ldc:int(0))) {
                invokevirtual:void(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\ub1b9\u8d98\u8308\ube23\u1187\u946b, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa)
            }
            
            return:GameProfile(var_7_97:GameProfile)
        }
        
        goto(Label_0006)
    }
    
    public com.mojang.authlib.GameProfile \u5fe1\u61a4\u69d9\u3711\ud171\u385b(java.util.UUID p0) {
        var_4_6F : \u5bc4\uc246\ud7e8\u5db4\u8709
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_4_6F = checkcast:\u5bc4\uc246\ud7e8\u5db4\u8709(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u5bc4\uc246\ud7e8\u5db4\u8709.class, invokeinterface:\u5bc4\uc246\ud7e8\u5db4\u8709(Map<UUID, \u5bc4\uc246\ud7e8\u5db4\u8709>::get, getfield:Map<UUID, \u5bc4\uc246\ud7e8\u5db4\u8709>(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\uc84e\u7006\u3711\u516c\u718f\u56bd, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa), p0:UUID[expected:Object]))
        
        if (cmpne:boolean(var_4_6F:\u5bc4\uc246\ud7e8\u5db4\u8709, aconstnull:\u5bc4\uc246\ud7e8\u5db4\u8709())) {
            invokevirtual:void(\u5bc4\uc246\ud7e8\u5db4\u8709::\u9af2\u183a\u74b1\u983f\uc2bd\ubefe, var_4_6F:\u5bc4\uc246\ud7e8\u5db4\u8709, invokespecial:long(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u8bb0\ub7dc\uf9c5\u92ff\u3d4b\u7ce1, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa))
            return:GameProfile(invokevirtual:GameProfile(\u5bc4\uc246\ud7e8\u5db4\u8709::\u1833\ubefe\u983f\ub70c\u67e9\u71ae, var_4_6F:\u5bc4\uc246\ud7e8\u5db4\u8709))
        }
        
        return:GameProfile(aconstnull:GameProfile())
    }
    
    private static java.text.DateFormat \ud12e\u8bb0\u7d52\uceb8\u7873\u8bb0() {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:DateFormat(initobject:SimpleDateFormat[expected:DateFormat](SimpleDateFormat::<init>, loadelement:String(getstatic:String[](\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u9033\u36d3\u8bb0\ucef1\u8350\u12b2), and:int(ldc:int(-10373), ldc:int(10372)))))
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\ua562\ucb79\uc87f\u3dd3\ubcb0.\u5bc4\uc246\ud7e8\u5db4\u8709> \u6b5f\ucb79\u4cd9\ube23\u8d98\u416d() {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    public void \ub1b9\u8d98\u8308\ube23\u1187\u946b() {
        // java.lang.IllegalStateException: Unsupported node type: com.strobel.decompiler.ast.Lambda
        //     at com.strobel.decompiler.ast.Error.unsupportedNode(Error.java:32)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:612)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:590)
        //     at com.strobel.decompiler.ast.GotoRemoval.exit(GotoRemoval.java:586)
        //     at com.strobel.decompiler.ast.GotoRemoval.transformLeaveStatements(GotoRemoval.java:625)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotosCore(GotoRemoval.java:57)
        //     at com.strobel.decompiler.ast.GotoRemoval.removeGotos(GotoRemoval.java:53)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:276)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileMethod(BytecodeAstLanguage.java:139)
        //     at com.strobel.decompiler.languages.BytecodeAstLanguage.decompileType(BytecodeAstLanguage.java:90)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:336)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:257)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:141)
    }
    
    private java.util.stream.Stream<\ua562\ucb79\uc87f\u3dd3\ubcb0.\u5bc4\uc246\ud7e8\u5db4\u8709> \u36d3\u156b\u071d\u47c2\u7043\u16f6(int p0) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            return:Stream<\u5bc4\uc246\ud7e8\u5db4\u8709>(invokeinterface:Stream<\u5bc4\uc246\ud7e8\u5db4\u8709>(Stream<\u5bc4\uc246\ud7e8\u5db4\u8709>::limit, invokeinterface:Stream<\u5bc4\uc246\ud7e8\u5db4\u8709>(Stream<\u5bc4\uc246\ud7e8\u5db4\u8709>::sorted, invokevirtual:Stream(ImmutableList::stream, invokestatic:ImmutableList(ImmutableList::copyOf, invokeinterface:Collection<\u5bc4\uc246\ud7e8\u5db4\u8709>(Map<UUID, \u5bc4\uc246\ud7e8\u5db4\u8709>::values, getfield:Map<UUID, \u5bc4\uc246\ud7e8\u5db4\u8709>(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\uc84e\u7006\u3711\u516c\u718f\u56bd, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa)))), invokeinterface:Comparator<Object>(Comparator<Object>::reversed, invokestatic:Comparator<Object>(Comparator<Object>::comparing, invokedynamic:Function<? super Object, Long>(apply:()Ljava/util/function/Function;)))), i2l:long(p0:int)))
        }
        
        goto(Label_0006)
    }
    
    private static com.google.gson.JsonElement \u8aa5\uf94d\u4492\u6198\u7c6b\u5bc4(\ua562\ucb79\uc87f\u3dd3\ubcb0.\u5bc4\uc246\ud7e8\u5db4\u8709 p0, java.text.DateFormat p1) {
        var_4_69 : JsonObject
        var_5_89 : UUID
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_4_69 = initobject:JsonObject(JsonObject::<init>)
            invokevirtual:void(JsonObject::addProperty, var_4_69:JsonObject, loadelement:String(getstatic:String[](\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u9033\u36d3\u8bb0\ucef1\u8350\u12b2), and:int(ldc:int(8658), ldc:int(14))), invokevirtual:String(GameProfile::getName, invokevirtual:GameProfile(\u5bc4\uc246\ud7e8\u5db4\u8709::\u1833\ubefe\u983f\ub70c\u67e9\u71ae, p0:\u5bc4\uc246\ud7e8\u5db4\u8709)))
            var_5_89 = invokevirtual:UUID(GameProfile::getId, invokevirtual:GameProfile(\u5bc4\uc246\ud7e8\u5db4\u8709::\u1833\ubefe\u983f\ub70c\u67e9\u71ae, p0:\u5bc4\uc246\ud7e8\u5db4\u8709))
            invokevirtual:void(JsonObject::addProperty, var_4_69:JsonObject, loadelement:String(getstatic:String[](\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u9033\u36d3\u8bb0\ucef1\u8350\u12b2), xor:int(ldc:int(8717), ldc:int(8718))), ternaryop:String(cmpne:boolean(var_5_89:UUID, aconstnull:UUID()), invokevirtual:String(UUID::toString, var_5_89:UUID), loadelement:String(getstatic:String[](\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u9033\u36d3\u8bb0\ucef1\u8350\u12b2), xor:int(ldc:int(5203), ldc:int(5207)))))
            invokevirtual:void(JsonObject::addProperty, var_4_69:JsonObject, loadelement:String(getstatic:String[](\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u9033\u36d3\u8bb0\ucef1\u8350\u12b2), and:int(ldc:int(549), ldc:int(16711))), invokevirtual:String(DateFormat::format, p1:DateFormat, invokevirtual:Date(\u5bc4\uc246\ud7e8\u5db4\u8709::\uc2bd\u8709\u5f50\ub102\u76bc\u7330, p0:\u5bc4\uc246\ud7e8\u5db4\u8709)))
            return:JsonElement(var_4_69:JsonObject)
        }
        
        goto(Label_0006)
    }
    
    private static \ua562\ucb79\uc87f\u3dd3\ubcb0.\u5bc4\uc246\ud7e8\u5db4\u8709 \uff55\ub6ab\ud171\u6198\ub6ab\uae87(com.google.gson.JsonElement p0, java.text.DateFormat p1) {
        var_2_61 : int
        var_2_B3 : int
        var_4_B8 : JsonObject
        var_2_BF : int
        var_5_D0 : JsonElement
        var_2_D7 : int
        var_6_E8 : JsonElement
        var_2_15D : int
        var_7_100 : JsonElement
        var_2_1B9 : int
        var_8_1BF : String
        var_2_1C6 : int
        var_9_1CC : String
        var_10_1D5 : Date
        var_11_20A : UUID
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_2_61 = and:int(ldc:int(856546376), ldc:int(1024115192))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(64)), ldc:int(0))) {
                goto(Label_0149)
            }
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(64)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-1854168868))
                
                if (logicalnot:boolean(invokevirtual:boolean(JsonElement::isJsonObject, p0:JsonElement))) {
                    return:\u5bc4\uc246\ud7e8\u5db4\u8709(aconstnull:\u5bc4\uc246\ud7e8\u5db4\u8709())
                }
            }
            
            Label_0127:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(8)), ldc:int(0))) {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(16777216)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_61 = and:int(var_2_61:int, ldc:int(429765995))
            }
            
            Label_0149:
            
            if (cmpne:boolean(and:int(var_2_61:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_61 = and:int(var_2_61:int, ldc:int(-752367396))
                goto(Label_0127)
            }
            
            if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(8192)), ldc:int(0))) {
                var_2_B3 = and:int(var_2_61:int, ldc:int(1743770846))
                var_4_B8 = invokevirtual:JsonObject(JsonElement::getAsJsonObject, p0:JsonElement)
                var_2_BF = and:int(var_2_B3:int, ldc:int(-846534151))
                var_5_D0 = invokevirtual:JsonElement(JsonObject::get, var_4_B8:JsonObject, loadelement:String(getstatic:String[](\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u9033\u36d3\u8bb0\ucef1\u8350\u12b2), xor:int(ldc:int(78), ldc:int(76))))
                var_2_D7 = and:int(var_2_BF:int, ldc:int(-1415840675))
                var_6_E8 = invokevirtual:JsonElement(JsonObject::get, var_4_B8:JsonObject, loadelement:String(getstatic:String[](\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u9033\u36d3\u8bb0\ucef1\u8350\u12b2), xor:int(ldc:int(8219), ldc:int(8216))))
                var_2_15D = and:int(var_2_D7:int, ldc:int(1668913661))
                var_7_100 = invokevirtual:JsonElement(JsonObject::get, var_4_B8:JsonObject, loadelement:String(getstatic:String[](\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u9033\u36d3\u8bb0\ucef1\u8350\u12b2), and:int(ldc:int(2061), ldc:int(12421))))
                
                loop {
                    if (cmpne:boolean(and:int(var_2_15D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0412)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_15D:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0355)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_15D:int, ldc:int(16777216)), ldc:int(0))) {
                        var_2_15D = and:int(var_2_15D:int, ldc:int(712793047))
                    }
                    else {
                        var_2_15D = and:int(var_2_15D:int, ldc:int(463336299))
                        
                        if (cmpeq:boolean(var_5_D0:JsonElement, aconstnull:JsonElement())) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0302:
                    
                    if (cmpne:boolean(and:int(var_2_15D:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_2_15D = and:int(var_2_15D:int, ldc:int(1418316681))
                        goto(Label_0412)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_15D:int, ldc:int(524288)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_2_15D:int, ldc:int(8)), ldc:int(0))) {
                            var_2_15D = and:int(var_2_15D:int, ldc:int(-7095097))
                            loopcontinue()
                        }
                        
                        var_2_15D = and:int(var_2_15D:int, ldc:int(829421002))
                        
                        if (cmpeq:boolean(var_6_E8:JsonElement, aconstnull:JsonElement())) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_0355:
                    
                    if (cmpeq:boolean(and:int(var_2_15D:int, ldc:int(524288)), ldc:int(0))) {
                        var_2_15D = and:int(var_2_15D:int, ldc:int(131933095))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_2_15D:int, ldc:int(2097152)), ldc:int(0))) {
                            var_2_15D = and:int(var_2_15D:int, ldc:int(1245658291))
                            goto(Label_0302)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_15D:int, ldc:int(64)), ldc:int(0))) {
                            var_2_15D = and:int(var_2_15D:int, ldc:int(-347942033))
                            loopcontinue()
                        }
                        
                        var_2_15D = and:int(var_2_15D:int, ldc:int(668641403))
                    }
                    
                    Label_0412:
                    
                    if (cmpne:boolean(and:int(var_2_15D:int, ldc:int(512)), ldc:int(0))) {
                        goto(Label_0355)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_15D:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_0302)
                    }
                    
                    if (cmpeq:boolean(and:int(var_2_15D:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_1B9 = and:int(var_2_15D:int, ldc:int(-1110474673))
                    var_8_1BF = invokevirtual:String(JsonElement::getAsString, var_6_E8:JsonElement)
                    var_2_1C6 = and:int(var_2_1B9:int, ldc:int(763998077))
                    var_9_1CC = invokevirtual:String(JsonElement::getAsString, var_5_D0:JsonElement)
                    var_10_1D5 = aconstnull:Date()
                    
                    if (cmpne:boolean(var_7_100:JsonElement, aconstnull:JsonElement())) {
                        try {
                            var_10_1D5 = invokevirtual:Date(DateFormat::parse, p1:DateFormat, invokevirtual:String(JsonElement::getAsString, var_7_100:JsonElement))
                        }
                        catch (java.text.ParseException stack_1F4_0) {
                        }
                    }
                    
                    if (logicaland:boolean(logicaland:boolean(cmpne:boolean(var_9_1CC:String, aconstnull:String()), cmpne:boolean(var_8_1BF:String, aconstnull:String())), cmpne:boolean(var_10_1D5:Date, aconstnull:Date()))) {
                        try {
                            var_11_20A = invokestatic:UUID(UUID::fromString, var_8_1BF:String)
                        }
                        catch (java.lang.Throwable var_12_213) {
                            return:\u5bc4\uc246\ud7e8\u5db4\u8709(aconstnull:\u5bc4\uc246\ud7e8\u5db4\u8709())
                        }
                        
                        return:\u5bc4\uc246\ud7e8\u5db4\u8709(initobject:\u5bc4\uc246\ud7e8\u5db4\u8709(\u5bc4\uc246\ud7e8\u5db4\u8709::<init>, initobject:GameProfile(GameProfile::<init>, var_11_20A:UUID, var_9_1CC:String), var_10_1D5:Date, aconstnull:\u4975\u7c6b\u0a06\u51b2\u76bc()))
                    }
                    
                    return:\u5bc4\uc246\ud7e8\u5db4\u8709(aconstnull:\u5bc4\uc246\ud7e8\u5db4\u8709())
                }
                
                return:\u5bc4\uc246\ud7e8\u5db4\u8709(aconstnull:\u5bc4\uc246\ud7e8\u5db4\u8709())
            }
        }
    }
    
    private static void lambda$\u9033\u6b5f\u3bd6\ud158\u59ec\u0800$1(com.google.gson.JsonArray p0, java.text.DateFormat p1, \ua562\ucb79\uc87f\u3dd3\ubcb0.\u5bc4\uc246\ud7e8\u5db4\u8709 p2) {
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            invokevirtual:void(JsonArray::add, p0:JsonArray, invokestatic:JsonElement(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u8aa5\uf94d\u4492\u6198\u7c6b\u5bc4, p2:\u5bc4\uc246\ud7e8\u5db4\u8709, p1:DateFormat))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static void lambda$\u7ce1\u8df4\uf94d\u5140\u16f6\ua562$0(java.text.DateFormat p0, java.util.List p1, com.google.gson.JsonElement p2) {
        var_5_67 : \u5bc4\uc246\ud7e8\u5db4\u8709
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpne:boolean(ldc:int(14), ldc:int(0))) {
            if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                loop {
                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                    
                    if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                        loop {
                            Label_0028:
                            invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                            
                            if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                    
                                    if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                        loopcontinue(Label_0028)
                                    }
                                    
                                    do {
                                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                    } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                    
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                looporswitchbreak(Label_0088)
                            }
                            
                            looporswitchbreak()
                        }
                    }
                }
            }
            
            Label_0088:
            var_5_67 = invokestatic:\u5bc4\uc246\ud7e8\u5db4\u8709(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\uff55\ub6ab\ud171\u6198\ub6ab\uae87, p2:JsonElement, p0:DateFormat)
            
            if (cmpne:boolean(var_5_67:\u5bc4\uc246\ud7e8\u5db4\u8709, aconstnull:\u5bc4\uc246\ud7e8\u5db4\u8709())) {
                invokeinterface:boolean(List<\u5bc4\uc246\ud7e8\u5db4\u8709>::add, p1:List<\u5bc4\uc246\ud7e8\u5db4\u8709>, var_5_67:\u5bc4\uc246\ud7e8\u5db4\u8709)
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_291 : int
        expr_6E : int [generated]
        stack_A4_0 : byte[] [generated]
        stack_A6_0 : byte[] [generated]
        stack_E7_0 : byte[] [generated]
        stack_E9_0 : byte[] [generated]
        stack_131_0 : byte[] [generated]
        stack_133_0 : byte[] [generated]
        stack_169_0 : byte[] [generated]
        stack_16B_0 : byte[] [generated]
        stack_1A9_0 : byte[] [generated]
        stack_2B5_0 : byte[] [generated]
        stack_306_0 : byte[] [generated]
        stack_375_0 : byte[] [generated]
        stack_3CC_0 : byte[] [generated]
        stack_44A_0 : byte[] [generated]
        var_4_27C : int
        var_3_281 : byte[]
        var_5_282 : int
        expr_2B5 : byte [generated]
        var_0_3E6 : int
        expr_3CC : byte [generated]
        stack_415_2 : byte [generated]
        stack_3E9_0 : byte [generated]
        var_2_A4 : byte[]
        expr_A8 : int [generated]
        var_3_2F4 : byte[]
        var_5_2F5 : int
        expr_E9 : int [generated]
        expr_133 : int [generated]
        expr_16B : int [generated]
        var_3_438 : byte[]
        var_5_439 : int
        var_3_1B5 : String
        stack_26F_0 : String[] [generated]
        expr_1C7 : String[] [generated]
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_0_291 = and:int(ldc:int(-1438761479), ldc:int(-1602235059))
        expr_6E = arraylength:int(stack_A4_0 = stack_A6_0 = stack_E7_0 = stack_E9_0 = stack_131_0 = stack_133_0 = stack_169_0 = stack_16B_0 = stack_1A9_0 = stack_2B5_0 = stack_306_0 = stack_375_0 = stack_3CC_0 = stack_44A_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("YI/Ld5bUUqKDTMp6fZ1DqKWE2ISEmVCGzI92iU6GqYKRgauokqVwgHd3moKfmnqO2bq62kpnp3uzylhhmUx1yGsOBbXSDA==")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_27C = expr_6E:int
        var_3_281 = newarray:byte[](byte.class, expr_6E:int)
        var_5_282 = expr_6E:int
        Label_0644:
        
        while (cmpne:boolean(and:int(var_0_291:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(1048576)), ldc:int(0))) {
                var_0_291 = and:int(var_0_291:int, ldc:int(-1601229725))
                goto(Label_0845)
            }
            
            var_0_291 = and:int(var_0_291:int, ldc:int(-845720261))
            var_5_282 = add:int(var_5_282:int, ldc:int(-1))
            expr_2B5 = loadelement:byte(stack_2B5_0:byte[], var_5_282:int)
            storeelement:byte(var_3_281:byte[], var_5_282:int, or:int(and:int(shl:int(expr_2B5:byte, and:int(ldc:int(24654), ldc:int(4))), ldc:int(-16)), and:int(shr:int(expr_2B5:byte[expected:int], and:int(ldc:int(4156), ldc:int(9159))), ldc:int(15))))
            
            if (cmpne:boolean(var_5_282:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_131_0 = stack_133_0 = stack_169_0 = stack_16B_0 = stack_1A9_0 = stack_2B5_0 = stack_306_0 = stack_375_0 = stack_3CC_0 = stack_44A_0 = var_3_281:byte[]
            goto(Label_0115)
        }
        
        var_0_291 = and:int(var_0_291:int, ldc:int(1880684337))
        goto(Label_0932)
        Label_0845:
        
        while (cmpeq:boolean(and:int(var_0_291:int, ldc:int(2)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(1)), ldc:int(0))) {
                goto(Label_0644)
            }
            
            var_0_291 = and:int(var_0_291:int, ldc:int(-541143059))
            var_5_282 = add:int(var_5_282:int, ldc:int(-1))
            storeelement:byte(var_3_281:byte[], var_5_282:int, add:byte(loadelement:byte(stack_375_0:byte[], var_5_282:int), ldc:byte(114)))
            
            if (cmpne:boolean(var_5_282:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_131_0 = stack_133_0 = stack_169_0 = stack_16B_0 = stack_1A9_0 = stack_2B5_0 = stack_306_0 = stack_375_0 = stack_3CC_0 = stack_44A_0 = var_3_281:byte[]
            goto(Label_0238)
        }
        
        var_0_291 = and:int(var_0_291:int, ldc:int(-330642384))
        Label_0932:
        
        while (cmpeq:boolean(and:int(var_0_291:int, ldc:int(4)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_291:int, ldc:int(16384)), ldc:int(0))) {
                goto(Label_0644)
            }
            
            var_0_3E6 = and:int(var_0_291:int, ldc:int(-2013851873))
            var_5_282 = add:int(var_5_282:int, ldc:int(-1))
            expr_3CC = stack_415_2 = loadelement(stack_3CC_0, var_5_282)
            
            if (cmplt:boolean(add:int(add:int(var_5_282:int, ldc:int(4)), neg:int(var_4_27C:int)), ldc:int(0))) {
                stack_415_2 = stack_3E9_0 = add:byte(expr_3CC:byte, loadelement:byte(var_3_281:byte[], add:int(var_5_282:int, ldc:int(4))))
                goto(Label_1017)
            }
            
            Label_0985:
            
            if (cmpeq:boolean(and:int(var_0_3E6:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_3E6 = and:int(var_0_3E6:int, ldc:int(-99213859))
                stack_415_2 = stack_3E9_0 = add:byte(expr_3CC:byte, ldc:byte(4))
            }
            
            Label_1017:
            
            if (cmpeq:boolean(and:int(var_0_3E6:int, ldc:int(1)), ldc:int(0))) {
                var_0_3E6 = and:int(var_0_3E6:int, ldc:int(-1189254777))
                goto(Label_0985)
            }
            
            var_0_291 = and:int(var_0_3E6:int, ldc:int(-1059147907))
            storeelement:byte(var_3_281:byte[], var_5_282:int, stack_415_2:byte)
            
            if (cmpne:boolean(var_5_282:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_131_0 = stack_133_0 = stack_169_0 = stack_16B_0 = stack_1A9_0 = stack_2B5_0 = stack_306_0 = stack_375_0 = stack_3CC_0 = stack_44A_0 = var_3_281:byte[]
            goto(Label_0312)
        }
        
        var_0_291 = and:int(var_0_291:int, ldc:int(-42437400))
        goto(Label_0845)
        Label_0115:
        
        if (cmpne:boolean(and:int(var_0_291:int, ldc:int(4)), ldc:int(0))) {
            var_0_291 = and:int(var_0_291:int, ldc:int(342436518))
            goto(Label_0368)
        }
        
        if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0312)
        }
        
        if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(1024)), ldc:int(0))) {
            goto(Label_0238)
        }
        
        if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(268435456)), ldc:int(0))) {
            var_0_291 = and:int(var_0_291:int, ldc:int(-576842419))
            var_2_A4 = stack_A4_0:byte[]
            expr_A8 = add:int(arraylength:int(stack_A6_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_A8:int, ldc:int(0))) {
                var_3_2F4 = newarray:byte[](byte.class, expr_A8:int)
                var_5_2F5 = expr_A8:int
                
                loop {
                    var_0_291 = and:int(var_0_291:int, ldc:int(-12417))
                    var_5_2F5 = add:int(var_5_2F5:int, ldc:int(-1))
                    storeelement:byte(var_3_2F4:byte[], var_5_2F5:int, add:int(shl:int(loadelement:byte(stack_306_0:byte[], var_5_2F5:int), ldc:int(4)), and:int(shr:int(loadelement:byte(var_2_A4:byte[], add:int(var_5_2F5:int, and:int(ldc:int(5), ldc:int(825)))), ldc:int(4)), xor:int(ldc:int(-23999), ldc:int(-23986)))))
                    
                    if (cmpne:boolean(var_5_2F5:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_131_0 = stack_133_0 = stack_169_0 = stack_16B_0 = stack_1A9_0 = stack_2B5_0 = stack_306_0 = stack_375_0 = stack_3CC_0 = stack_44A_0 = var_3_2F4:byte[]
            }
        }
        
        Label_0173:
        
        if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(256)), ldc:int(0))) {
            goto(Label_0368)
        }
        
        if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(262144)), ldc:int(0))) {
            var_0_291 = and:int(var_0_291:int, ldc:int(-791628820))
            goto(Label_0312)
        }
        
        if (cmpne:boolean(and:int(var_0_291:int, ldc:int(8)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(256)), ldc:int(0))) {
                var_0_291 = and:int(var_0_291:int, ldc:int(167409678))
                goto(Label_0115)
            }
            
            var_0_291 = and:int(var_0_291:int, ldc:int(-2005490293))
            expr_E9 = arraylength:int(stack_E9_0:byte[])
            
            if (cmpne:boolean(expr_E9:int, ldc:int(0))) {
                var_4_27C = expr_E9:int
                var_3_281 = newarray:byte[](byte.class, expr_E9:int)
                var_5_282 = expr_E9:int
                goto(Label_0845)
            }
        }
        
        Label_0238:
        
        if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(131072)), ldc:int(0))) {
            var_0_291 = and:int(var_0_291:int, ldc:int(1948624266))
            goto(Label_0368)
        }
        
        if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(268435456)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(1024)), ldc:int(0))) {
                var_0_291 = and:int(var_0_291:int, ldc:int(-2137474504))
                goto(Label_0173)
            }
            
            if (cmpne:boolean(and:int(var_0_291:int, ldc:int(16384)), ldc:int(0))) {
                var_0_291 = and:int(var_0_291:int, ldc:int(878767975))
                goto(Label_0115)
            }
            
            var_0_291 = and:int(var_0_291:int, ldc:int(-251785443))
            expr_133 = arraylength:int(stack_133_0:byte[])
            
            if (cmpne:boolean(expr_133:int, ldc:int(0))) {
                var_4_27C = expr_133:int
                var_3_281 = newarray:byte[](byte.class, expr_133:int)
                var_5_282 = expr_133:int
                goto(Label_0932)
            }
        }
        
        Label_0312:
        
        if (cmpne:boolean(and:int(var_0_291:int, ldc:int(1024)), ldc:int(0))) {
            if (cmpne:boolean(and:int(var_0_291:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0238)
            }
            
            if (cmpne:boolean(and:int(var_0_291:int, ldc:int(2)), ldc:int(0))) {
                goto(Label_0173)
            }
            
            if (cmpne:boolean(and:int(var_0_291:int, ldc:int(16777216)), ldc:int(0))) {
                var_0_291 = and:int(var_0_291:int, ldc:int(1645870982))
                goto(Label_0115)
            }
            
            var_0_291 = and:int(var_0_291:int, ldc:int(-254322727))
            expr_16B = arraylength:int(stack_16B_0:byte[])
            
            if (cmpne:boolean(expr_16B:int, ldc:int(0))) {
                var_3_438 = newarray:byte[](byte.class, expr_16B:int)
                var_5_439 = expr_16B:int
                
                loop {
                    var_0_291 = and:int(var_0_291:int, ldc:int(-1414109735))
                    var_5_439 = add:int(var_5_439:int, ldc:int(-1))
                    storeelement:byte(var_3_438:byte[], var_5_439:int, xor:byte(loadelement:byte(stack_44A_0:byte[], var_5_439:int), ldc:byte(8)))
                    
                    if (cmpne:boolean(var_5_439:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_A6_0 = stack_A4_0 = stack_E7_0 = stack_E9_0 = stack_131_0 = stack_133_0 = stack_169_0 = stack_16B_0 = stack_1A9_0 = stack_2B5_0 = stack_306_0 = stack_375_0 = stack_3CC_0 = stack_44A_0 = var_3_438:byte[]
            }
        }
        
        Label_0368:
        
        if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(262144)), ldc:int(0))) {
            goto(Label_0312)
        }
        
        if (cmpeq:boolean(and:int(var_0_291:int, ldc:int(1048576)), ldc:int(0))) {
            var_0_291 = and:int(var_0_291:int, ldc:int(-1694421255))
            goto(Label_0238)
        }
        
        if (cmpne:boolean(and:int(var_0_291:int, ldc:int(268435456)), ldc:int(0))) {
            goto(Label_0173)
        }
        
        if (cmpne:boolean(and:int(var_0_291:int, ldc:int(16384)), ldc:int(0))) {
            var_0_291 = and:int(var_0_291:int, ldc:int(-1819919809))
            goto(Label_0115)
        }
        
        var_3_1B5 = initobject:String(String::<init>, stack_1A9_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_26F_0 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(17057), ldc:int(17063)))
        expr_1C7 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(17986), ldc:int(17988)))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(2077), ldc:int(5188)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(-13025), ldc:int(12992)), and:int(ldc:int(17633), ldc:int(-28386))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(2065), ldc:int(4453)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(-4411), ldc:int(4410)), and:int(ldc:int(8223), ldc:int(1279))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(21517), ldc:int(775)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(16971), ldc:int(16980)), and:int(ldc:int(1320), ldc:int(20524))))
        storeelement:String(expr_1C7:String[], xor:int(ldc:int(8459), ldc:int(8457)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(680), ldc:int(3178)), xor:int(ldc:int(419), ldc:int(399))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(835), ldc:int(16443)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, xor:int(ldc:int(40), ldc:int(4)), and:int(ldc:int(8368), ldc:int(6194))))
        storeelement:String(expr_1C7:String[], and:int(ldc:int(-3745), ldc:int(3744)), invokevirtual:String[expected:String](String::substring, var_3_1B5:String, and:int(ldc:int(11314), ldc:int(17276)), and:int(ldc:int(27109), ldc:int(69))))
        putstatic:String[](\ub1b9\u983f\uf9c5\u6fb0\u51fa::\u9033\u36d3\u8bb0\ucef1\u8350\u12b2, expr_1C7:String[])
        putstatic:Logger(\ub1b9\u983f\uf9c5\u6fb0\u51fa::\uc9f6\u8753\u8df4\ub32d\ua61f\u6ec6, invokestatic:Logger(LogManager::getLogger))
    }
    
    public void \uc2bd\u120d\ubff1\u8258\u62da\uafe7(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_669 : int
        var_5_81 : int
        var_6_88 : int
        var_7_97 : double
        var_9_C8 : double
        var_3_DA : int
        var_11_EB : int
        var_14_115 : double
        var_16_119 : int
        var_12_111 : double
        var_17_674 : int
        
        if (cmpne:boolean(ldc:int(15), ldc:int(0))) {
        }
        
        Label_0006:
        
        if (cmpeq:boolean(ldc:int(14), ldc:int(0))) {
            goto(Label_0006)
        }
        
        if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
            loop {
                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#0"))
                
                if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                    loop {
                        Label_0028:
                        invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#1"))
                        
                        if (cmpne:boolean(ldc:int(2), ldc:int(0))) {
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#2"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            do {
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#3"))
                                
                                if (cmpeq:boolean(ldc:int(2), ldc:int(0))) {
                                    loopcontinue(Label_0028)
                                }
                                
                                do {
                                    invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#4"))
                                } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                                
                                invokevirtual:void(PrintStream::println, getstatic:PrintStream(System::out), ldc:String("#5"))
                            } while (cmpeq:boolean(ldc:int(2), ldc:int(0)))
                            
                            looporswitchbreak(Label_0088)
                        }
                        
                        looporswitchbreak()
                    }
                }
            }
        }
        
        Label_0088:
        var_3_669 = and:int(ldc:int(1552981997), ldc:int(-560148007))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\ub1b9\u983f\uf9c5\u6fb0\u51fa[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0171)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(1574406551))
            var_5_81 = and:int(ldc:int(9302), ldc:int(-13399))
            var_6_88 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_97 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(18793), ldc:int(-19306)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C8 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_DA = and:int(var_3_669:int, ldc:int(1560280521))
                    var_9_C8 = sub:double(var_7_97:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EB = var_5_81:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EB:int, sub:int(var_6_88:int, xor:int(ldc:int(66), ldc:int(67)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EB:int, and:int(ldc:int(8449), ldc:int(4241)))), var_7_97:double))) {
                        inc:int(var_11_EB, ldc:int(1))
                    }
                    
                    var_3_669 = and:int(var_3_DA:int, ldc:int(1609795565))
                    var_14_115 = var_7_97:double
                    var_16_119 = var_11_EB:int
                }
                else {
                    var_11_EB = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_81:int), xor:int(ldc:int(-32740), ldc:int(-32739)))
                    var_12_111 = var_14_115 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81)
                    
                    if (cmplt:boolean(var_16_119 = var_11_EB:int, var_6_88:int)) {
                        var_9_C8 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EB:int)
                        var_16_119 = var_11_EB:int
                        var_14_115 = var_12_111:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1262361126))
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(170670095))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-373982937))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(2046060103))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1034080798))
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1177812511))
                    }
                    else {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1644369507))
                        
                        if (cmplt:boolean(var_16_119:int, var_6_88:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0595)
                            }
                            
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0429:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1104375852))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(306771050))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1023147097))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(238729090))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1095239197))
                        var_11_EB = and:int(ldc:int(10074), ldc:int(-10075))
                        goto(Label_1526)
                    }
                    
                    Label_0595:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(13822437))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(2058199148))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(828971085))
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-277886752))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-787426953))
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(2106844617))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_115 = var_9_C8:double
                            goto(Label_0870)
                        }
                    }
                    
                    Label_0729:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(2069360019))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1949902708))
                        goto(Label_1164)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-108060784))
                        goto(Label_0995)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(128)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(392596712))
                            goto(Label_0595)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1615915259))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1648505933))
                        var_14_115 = mul:double(ldc:double(0.5), add:double(var_9_C8:double, var_14_115:double))
                    }
                    
                    Label_0870:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(513714978))
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-606241411))
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1338561639))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1578804962))
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-587283063))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_81:int), var_7_97:double)) {
                                var_11_EB = and:int(ldc:int(10561), ldc:int(16903))
                                goto(Label_1164)
                            }
                        }
                    }
                    
                    Label_0995:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1867677703))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(134217728)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-852175882))
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1478800462))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1930476152))
                            goto(Label_0729)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(1320187657))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-51258957))
                        var_11_EB = and:int(ldc:int(916), ldc:int(-917))
                    }
                    
                    Label_1164:
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(164127420))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-156660186))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1029399263))
                            goto(Label_0429)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1124227661))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                                goto(Label_1407)
                            }
                        }
                    }
                    
                    Label_1280:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1289860121))
                        goto(Label_1537)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1695874447))
                            goto(Label_1164)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                            goto(Label_0995)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0870)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0729)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0595)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0429)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_669 = and:int(var_3_669:int, ldc:int(-1515561711))
                            loopcontinue()
                        }
                        
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1627728913))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_115:double, var_5_81:int, var_16_119:int)
                        goto(Label_1526)
                    }
                    
                    Label_1407:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1537)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1280)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(131072)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-2069993530))
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(693336664))
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(65536)), ldc:int(0))) {
                        goto(Label_0595)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0429)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_669 = and:int(var_3_669:int, ldc:int(-40136249))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_115:double, ldc:double(0.0))
                    Label_1526:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_674 = var_5_81:int
                        
                        if (cmpeq:boolean(var_11_EB:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1537:
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(2)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(1847482083))
                        goto(Label_1280)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1164)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0995)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0870)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0729)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1285194835))
                        goto(Label_0595)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-2025376390))
                        goto(Label_0429)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_669:int, ldc:int(256)), ldc:int(0))) {
                        var_3_669 = and:int(var_3_669:int, ldc:int(-1126568963))
                        var_17_674 = add:int(var_16_119:int, xor:int(ldc:int(4608), ldc:int(4609)))
                        looporswitchbreak()
                    }
                }
                
                var_3_669 = and:int(var_3_669:int, ldc:int(-1667915839))
                
                if (cmple:boolean(var_5_81 = var_17_674:int, sub:int(var_6_88:int, xor:int(ldc:int(2496), ldc:int(2497))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0171:
        
        if (cmpeq:boolean(and:int(var_3_669:int, ldc:int(268435456)), ldc:int(0))) {
            var_3_669 = and:int(var_3_669:int, ldc:int(1929980940))
            goto(Label_0108)
        }
    }
}
