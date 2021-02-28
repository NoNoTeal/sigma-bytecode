public class \u3bc9\u67e9\uc87f\u47c2\u5f50.\u16f6\u40a9\u5f50\ub113\ud51e.\u7c6b\u9937\u1187\u624e\u3dd3 {
    public void \u7c6b\u9937\u1187\u624e\u3dd3(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f p0) {
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
            invokespecial:Object(Object::<init>, this:\u7c6b\u9937\u1187\u624e\u3dd3)
            putfield:Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>(\u7c6b\u9937\u1187\u624e\u3dd3::\u3bd6\u72f1\u97b7\u4d85\ub113\ub32d, this:\u7c6b\u9937\u1187\u624e\u3dd3, invokestatic:HashMap[expected:Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>](Maps::newHashMap))
            putfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3, initobject:ReentrantReadWriteLock[expected:ReadWriteLock](ReentrantReadWriteLock::<init>))
            putfield:boolean(\u7c6b\u9937\u1187\u624e\u3dd3::\u12b2\u51fa\u8d90\u69d9\u9937\u5654, this:\u7c6b\u9937\u1187\u624e\u3dd3, xor:int[expected:boolean](ldc:int(27648), ldc:int(27649)))
            putfield:\uc2e8\u9255\u647c\ud171\ubf56(\u7c6b\u9937\u1187\u624e\u3dd3::\uf94d\u40a9\u5245\u4492\u624e\ubcb0, this:\u7c6b\u9937\u1187\u624e\u3dd3, getstatic:\uc2e8\u9255\u647c\ud171\ubf56(\u516c\u9a18\u600f\ud171\u946b\ubf56::\uf94d\u392e\u9a18\ub83f\uc3e3\u8640))
            putfield:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u7c6b\u9937\u1187\u624e\u3dd3::\u9937\u61a4\uf995\u8d90\u718f\ub8be, this:\u7c6b\u9937\u1187\u624e\u3dd3, getstatic:\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56(\u6b0d\ud171\uc7fe\u52d3\uafe7\u6c56::\u92ee\u56bd\u7ce1\ua6bd\u8709\u946b))
            putfield:\u7d52\u718f\u3776\u6fb0\ub83f(\u7c6b\u9937\u1187\u624e\u3dd3::\uf94d\ube23\u516c\uc238\u7873\u6c56, this:\u7c6b\u9937\u1187\u624e\u3dd3, p0:\u7d52\u718f\u3776\u6fb0\ub83f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public static \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5fe1\ufcaf\u3711\ub113\uc87f<T> \u156b\u6d99\u4492\uc229\ub171\u4daf(java.lang.Class<? extends \u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f> p0, \ud36e\u6bb9\u960f\u4c04\u64ab.\uc2bd\u8413\ua068\u6bb9\u183a<T> p1) {
        var_2_5F : int
        var_4_11F : Class<?>
        var_5_2E3 : int
        var_2_2E9 : int
        var_6_2EB : Class<? super \u7d52\u718f\u3776\u6fb0\ub83f>
        var_2_2BB : int
        var_4_2D3 : int
        
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
        var_2_5F = and:int(ldc:int(1656510724), ldc:int(706532779))
        
        loop {
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(524288)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(551876453))
                goto(Label_0628)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                goto(Label_0572)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(536870912)), ldc:int(0))) {
                goto(Label_0488)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0219)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(536870912)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-83980015))
                
                if (logicalnot:boolean(invokeinterface:boolean(Logger::isDebugEnabled, getstatic:Logger(\u7c6b\u9937\u1187\u624e\u3dd3::\u0b8e\u3776\ua562\u71ae\ud158\ubb2b)))) {
                    goto(Label_0488)
                }
            }
            
            Label_0155:
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(4194304)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1370801430))
                goto(Label_0628)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8192)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(778611908))
                goto(Label_0572)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-2114699679))
                goto(Label_0488)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4194304)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1210188505))
            }
            
            try {
                Label_0219:
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(134217728)), ldc:int(0))) {
                    goto(Label_0628)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(536870912)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1494140438))
                    goto(Label_0572)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(32)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1)), ldc:int(0))) {
                        goto(Label_0155)
                    }
                    
                    if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1024)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_2_5F = and:int(var_2_5F:int, ldc:int(1983722395))
                    var_4_11F = invokestatic:Class<?>(Class<T>::forName, invokevirtual:String(StackTraceElement::getClassName, loadelement:StackTraceElement(invokevirtual:StackTraceElement[](Thread::getStackTrace, invokestatic:Thread(Thread::currentThread)), xor:int(ldc:int(8256), ldc:int(8258)))))
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_0437)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0366)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4194304)), ldc:int(0))) {
                            var_2_5F = and:int(var_2_5F:int, ldc:int(-201412150))
                            
                            if (invokevirtual:boolean(Object::equals, var_4_11F:Class<?>[expected:Object], p0:Class<\u7d52\u718f\u3776\u6fb0\ub83f>[expected:Object])) {
                                goto(Label_0437)
                            }
                        }
                        
                        Label_0324:
                        
                        if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1024)), ldc:int(0))) {
                            var_2_5F = and:int(var_2_5F:int, ldc:int(1233449679))
                            goto(Label_0437)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(8)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(1024)), ldc:int(0))) {
                                var_2_5F = and:int(var_2_5F:int, ldc:int(1352421903))
                                loopcontinue()
                            }
                            
                            var_2_5F = and:int(var_2_5F:int, ldc:int(-1556325002))
                        }
                        
                        Label_0366:
                        
                        if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(262144)), ldc:int(0))) {
                            var_2_5F = and:int(var_2_5F:int, ldc:int(-61288412))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8192)), ldc:int(0))) {
                                goto(Label_0324)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(16)), ldc:int(0))) {
                                var_2_5F = and:int(var_2_5F:int, ldc:int(15562460))
                                loopcontinue()
                            }
                            
                            var_2_5F = and:int(var_2_5F:int, ldc:int(1985830179))
                            invokeinterface:void(Logger::debug, getstatic:Logger(\u7c6b\u9937\u1187\u624e\u3dd3::\u0b8e\u3776\ua562\u71ae\ud158\ubb2b), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), and:int(ldc:int(-10462), ldc:int(10333))), p0:Class<\u7d52\u718f\u3776\u6fb0\ub83f>[expected:Object], var_4_11F:Class<?>[expected:Object], initobject:RuntimeException[expected:Object](RuntimeException::<init>))
                        }
                        
                        Label_0437:
                        
                        if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(33554432)), ldc:int(0))) {
                            var_2_5F = and:int(var_2_5F:int, ldc:int(-386112312))
                            goto(Label_0366)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(536870912)), ldc:int(0))) {
                            goto(Label_0324)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(32)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_2_5F = and:int(var_2_5F:int, ldc:int(1928960864))
                    }
                    
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-203564704))
                }
            }
            catch (java.lang.ClassNotFoundException stack_1E6_0) {
            }
            
            Label_0488:
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8192)), ldc:int(0))) {
                goto(Label_0628)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(4096)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(26083958))
            }
            else {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(32768)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1558671337))
                    goto(Label_0219)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1048576)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(751895010))
                    goto(Label_0155)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(16)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(756591213))
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(-270773862))
                
                if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getstatic:Map<Class<? extends \u7d52\u718f\u3776\u6fb0\ub83f>, Integer>(\u7c6b\u9937\u1187\u624e\u3dd3::\uae5d\u9af2\u9937\uc229\u9af2\u51fa), p0:Class<\u7d52\u718f\u3776\u6fb0\ub83f>[expected:Object]))) {
                    var_5_2E3 = and:int(ldc:int(-12359), ldc:int(12358))
                    var_2_2E9 = and:int(var_2_5F:int, ldc:int(-1373735024))
                    var_6_2EB = p0:Class<\u7d52\u718f\u3776\u6fb0\ub83f>
                    
                    loop {
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(524288)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-889503832))
                            goto(Label_1388)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1310)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(262144)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-1341072189))
                            goto(Label_1214)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(268435456)), ldc:int(0))) {
                            goto(Label_1136)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1045)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(1024)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-1175662802))
                            goto(Label_0936)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(4096)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-532104769))
                        }
                        else {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(1916665612))
                            
                            if (cmpeq:boolean(var_6_2EB:Class<\u7d52\u718f\u3776\u6fb0\ub83f>, ldc:Class<\u7d52\u718f\u3776\u6fb0\ub83f>(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\u4daf\u3504\u4975\u59ec\u183a.\u7d52\u718f\u3776\u6fb0\ub83f.class))) {
                                goto(Label_1388)
                            }
                        }
                        
                        Label_0842:
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(33554432)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(1047712918))
                            goto(Label_1388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(1048576)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-1905406214))
                            goto(Label_1310)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(32768)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(1231059923))
                            goto(Label_1214)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(2)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(1289603925))
                            goto(Label_1136)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1045)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(8)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(16)), ldc:int(0))) {
                                var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-1445473461))
                                loopcontinue()
                            }
                            
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-4399797))
                        }
                        
                        Label_0936:
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(268435456)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(259222681))
                            goto(Label_1388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(33554432)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(328412107))
                            goto(Label_1310)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(536870912)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-567677714))
                            goto(Label_1214)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(16)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-998317921))
                            goto(Label_1136)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(1048576)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-33983167))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(1024)), ldc:int(0))) {
                                var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-1369584485))
                                goto(Label_0842)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(4194304)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-1285582059))
                            var_6_2EB = invokevirtual:Class<? super \u7d52\u718f\u3776\u6fb0\ub83f>(Class<\u7d52\u718f\u3776\u6fb0\ub83f>::getSuperclass, var_6_2EB:Class<\u7d52\u718f\u3776\u6fb0\ub83f>)
                        }
                        
                        Label_1045:
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(512)), ldc:int(0))) {
                            goto(Label_1388)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(16)), ldc:int(0))) {
                            goto(Label_1310)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(262144)), ldc:int(0))) {
                            goto(Label_1214)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(32)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-1037436574))
                        }
                        else {
                            if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(33554432)), ldc:int(0))) {
                                goto(Label_0936)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(2)), ldc:int(0))) {
                                var_2_2E9 = and:int(var_2_2E9:int, ldc:int(1742572628))
                                goto(Label_0842)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(8192)), ldc:int(0))) {
                                var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-1773475595))
                                loopcontinue()
                            }
                            
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-209858148))
                            
                            if (logicalnot:boolean(invokeinterface:boolean(Map<K, V>::containsKey, getstatic:Map<Class<? extends \u7d52\u718f\u3776\u6fb0\ub83f>, Integer>(\u7c6b\u9937\u1187\u624e\u3dd3::\uae5d\u9af2\u9937\uc229\u9af2\u51fa), var_6_2EB:Class<\u7d52\u718f\u3776\u6fb0\ub83f>[expected:Object]))) {
                                loopcontinue()
                            }
                        }
                        
                        Label_1136:
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_1388)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1310)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(8)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-835176575))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(512)), ldc:int(0))) {
                                goto(Label_1045)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(1024)), ldc:int(0))) {
                                goto(Label_0936)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(32)), ldc:int(0))) {
                                var_2_2E9 = and:int(var_2_2E9:int, ldc:int(1747066565))
                                goto(Label_0842)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(268435456)), ldc:int(0))) {
                                var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-1100856763))
                                loopcontinue()
                            }
                            
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(1744818959))
                        }
                        
                        Label_1214:
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(1)), ldc:int(0))) {
                            goto(Label_1388)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(33554432)), ldc:int(0))) {
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(2)), ldc:int(0))) {
                                goto(Label_1136)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(256)), ldc:int(0))) {
                                goto(Label_1045)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(512)), ldc:int(0))) {
                                var_2_2E9 = and:int(var_2_2E9:int, ldc:int(1494929190))
                                goto(Label_0936)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(524288)), ldc:int(0))) {
                                var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-633802537))
                                goto(Label_0842)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(8192)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(922580428))
                            var_5_2E3 = add:int(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Map<Class<? extends \u7d52\u718f\u3776\u6fb0\ub83f>, Integer>::get, getstatic:Map<Class<? extends \u7d52\u718f\u3776\u6fb0\ub83f>, Integer>(\u7c6b\u9937\u1187\u624e\u3dd3::\uae5d\u9af2\u9937\uc229\u9af2\u51fa), var_6_2EB:Class<\u7d52\u718f\u3776\u6fb0\ub83f>[expected:Object]))), xor:int(ldc:int(-32766), ldc:int(-32765)))
                        }
                        
                        Label_1310:
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(8192)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(334227611))
                        }
                        else {
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(268435456)), ldc:int(0))) {
                                var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-757138772))
                                goto(Label_1214)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(262144)), ldc:int(0))) {
                                goto(Label_1136)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(1)), ldc:int(0))) {
                                goto(Label_1045)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(16)), ldc:int(0))) {
                                goto(Label_0936)
                            }
                            
                            if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(524288)), ldc:int(0))) {
                                goto(Label_0842)
                            }
                            
                            if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(512)), ldc:int(0))) {
                                var_2_2E9 = and:int(var_2_2E9:int, ldc:int(1287164497))
                                loopcontinue()
                            }
                            
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(2078072639))
                        }
                        
                        Label_1388:
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(134217728)), ldc:int(0))) {
                            goto(Label_1310)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(536870912)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(410662408))
                            goto(Label_1214)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(33554432)), ldc:int(0))) {
                            goto(Label_1136)
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_2E9:int, ldc:int(256)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-2017474878))
                            goto(Label_1045)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(32768)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(-451512761))
                            goto(Label_0936)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(2)), ldc:int(0))) {
                            var_2_2E9 = and:int(var_2_2E9:int, ldc:int(99646014))
                            goto(Label_0842)
                        }
                        
                        if (cmpne:boolean(and:int(var_2_2E9:int, ldc:int(524288)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_2_2E9 = and:int(var_2_2E9:int, ldc:int(335095962))
                    }
                    
                    var_2_2BB = and:int(var_2_2E9:int, ldc:int(-1373864457))
                    var_4_2D3 = var_5_2E3:int
                    looporswitchbreak()
                }
            }
            
            Label_0572:
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(2059949859))
            }
            else {
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(268435456)), ldc:int(0))) {
                    goto(Label_0488)
                }
                
                if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(2)), ldc:int(0))) {
                    var_2_5F = and:int(var_2_5F:int, ldc:int(-1869044698))
                    goto(Label_0219)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(262144)), ldc:int(0))) {
                    goto(Label_0155)
                }
                
                if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(1048576)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_5F = and:int(var_2_5F:int, ldc:int(671028157))
            }
            
            Label_0628:
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(2147483647)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(1658179638))
                goto(Label_0572)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(8192)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(2001358944))
                goto(Label_0488)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(262144)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-1015660109))
                goto(Label_0219)
            }
            
            if (cmpne:boolean(and:int(var_2_5F:int, ldc:int(32768)), ldc:int(0))) {
                var_2_5F = and:int(var_2_5F:int, ldc:int(-530406863))
                goto(Label_0155)
            }
            
            if (cmpeq:boolean(and:int(var_2_5F:int, ldc:int(16)), ldc:int(0))) {
                var_2_2BB = and:int(var_2_5F:int, ldc:int(-1373884144))
                var_4_2D3 = add:int(invokevirtual:int(Integer::intValue, checkcast:Integer(java.lang.Integer.class, invokeinterface:Integer(Map<Class<? extends \u7d52\u718f\u3776\u6fb0\ub83f>, Integer>::get, getstatic:Map<Class<? extends \u7d52\u718f\u3776\u6fb0\ub83f>, Integer>(\u7c6b\u9937\u1187\u624e\u3dd3::\uae5d\u9af2\u9937\uc229\u9af2\u51fa), p0:Class<\u7d52\u718f\u3776\u6fb0\ub83f>[expected:Object]))), and:int(ldc:int(19), ldc:int(12329)))
                looporswitchbreak()
            }
        }
        
        loop {
            if (cmpne:boolean(and:int(var_2_2BB:int, ldc:int(4194304)), ldc:int(0))) {
                goto(Label_1541)
            }
            
            if (cmpeq:boolean(and:int(var_2_2BB:int, ldc:int(1024)), ldc:int(0))) {
                var_2_2BB = and:int(var_2_2BB:int, ldc:int(-1359152863))
                
                if (cmple:boolean(var_4_2D3:int, and:int(ldc:int(20734), ldc:int(254)))) {
                    invokeinterface:Integer(Map<Class<\u7d52\u718f\u3776\u6fb0\ub83f>, Integer>::put, getstatic:Map<Class<? extends \u7d52\u718f\u3776\u6fb0\ub83f>, Integer>(\u7c6b\u9937\u1187\u624e\u3dd3::\uae5d\u9af2\u9937\uc229\u9af2\u51fa), p0:Class<\u7d52\u718f\u3776\u6fb0\ub83f>, invokestatic:Integer(Integer::valueOf, var_4_2D3:int))
                    return:\u5fe1\ufcaf\u3711\ub113\uc87f<T>(invokeinterface:\u5fe1\ufcaf\u3711\ub113\uc87f<T>(\uc2bd\u8413\ua068\u6bb9\u183a<T>::\u4d85\uc87f\ufe34\u8350\ua068\u2dcc, p1:\uc2bd\u8413\ua068\u6bb9\u183a<T>, var_4_2D3:int))
                }
            }
            
            Label_1521:
            
            if (cmpeq:boolean(and:int(var_2_2BB:int, ldc:int(32768)), ldc:int(0))) {
                if (cmpne:boolean(and:int(var_2_2BB:int, ldc:int(4194304)), ldc:int(0))) {
                    loopcontinue()
                }
                
                var_2_2BB = and:int(var_2_2BB:int, ldc:int(725545950))
            }
            
            Label_1541:
            
            if (cmpeq:boolean(and:int(var_2_2BB:int, ldc:int(4096)), ldc:int(0))) {
                var_2_2BB = and:int(var_2_2BB:int, ldc:int(-623691793))
                goto(Label_1521)
            }
            
            if (cmpne:boolean(and:int(var_2_2BB:int, ldc:int(4096)), ldc:int(0))) {
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), xor:int(ldc:int(1026), ldc:int(1027)))), var_4_2D3:int), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), and:int(ldc:int(11266), ldc:int(4726)))), xor:int(ldc:int(1185), ldc:int(1119))), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), xor:int(ldc:int(8385), ldc:int(8386)))))))
            }
        }
    }
    
    public void \u8753\uae87\ud158\u624e\u12b2\u4daf(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5fe1\ufcaf\u3711\ub113\uc87f<T> p0, T p1) {
        var_3_61 : int
        var_5_66 : int
        var_3_80 : int
        
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
        var_3_61 = and:int(ldc:int(-2029902414), ldc:int(-818944286))
        var_5_66 = invokevirtual:int(\u5fe1\ufcaf\u3711\ub113\uc87f<T>::\u92ff\u2dcc\ub70c\u494c\u7af6\u6bb9, p0:\u5fe1\ufcaf\u3711\ub113\uc87f<Object>)
        
        if (cmpgt:boolean(var_5_66:int, and:int(ldc:int(255), ldc:int(19710)))) {
            athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), xor:int(ldc:int(712), ldc:int(713)))), var_5_66:int), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), and:int(ldc:int(18434), ldc:int(2010)))), xor:int(ldc:int(-32737), ldc:int(-32543))), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), and:int(ldc:int(17451), ldc:int(4615)))))))
        }
        
        loop {
            if (cmpeq:boolean(and:int(var_3_61:int, ldc:int(2)), ldc:int(0))) {
                var_3_80 = and:int(var_3_61:int, ldc:int(-1026468183))
            }
            else {
                var_3_80 = and:int(var_3_61:int, ldc:int(-1745488458))
                
                if (invokeinterface:boolean(Map<K, V>::containsKey, getfield:Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>(\u7c6b\u9937\u1187\u624e\u3dd3::\u3bd6\u72f1\u97b7\u4d85\ub113\ub32d, this:\u7c6b\u9937\u1187\u624e\u3dd3), invokestatic:Integer(Integer::valueOf, var_5_66:int))) {
                    athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), xor:int(ldc:int(0), ldc:int(4)))), var_5_66:int), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), and:int(ldc:int(16805), ldc:int(12303)))))))
                }
            }
            
            if (cmpne:boolean(and:int(var_3_80:int, ldc:int(4096)), ldc:int(0))) {
                var_3_61 = and:int(var_3_80:int, ldc:int(-2016994519))
            }
            else {
                if (cmpge:boolean(invokestatic:int(\u3dd3\u4f4a\u64ab\ubb2b\ud12e::\u97b7\u36d3\u98a4\uc84e\ubff1\ub83f, invokevirtual:\uc2bd\u8413\ua068\u6bb9\u183a<Object>(\u5fe1\ufcaf\u3711\ub113\uc87f<Object>::\u7af6\ub7dc\u12b2\u7330\u9af2\u647c, p0:\u5fe1\ufcaf\u3711\ub113\uc87f<Object>)), ldc:int(0))) {
                    invokespecial:void(\u7c6b\u9937\u1187\u624e\u3dd3::\u6c56\u3e75\u516c\u76bc\u7bad\u647c, this:\u7c6b\u9937\u1187\u624e\u3dd3, p0:\u5fe1\ufcaf\u3711\ub113\uc87f<Object>, p1:T[expected:Object])
                    return:void()
                }
                
                athrow(initobject:IllegalArgumentException(IllegalArgumentException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), xor:int(ldc:int(10256), ldc:int(10262)))), invokevirtual:\uc2bd\u8413\ua068\u6bb9\u183a<Object>[expected:Object](\u5fe1\ufcaf\u3711\ub113\uc87f<Object>::\u7af6\ub7dc\u12b2\u7330\u9af2\u647c, p0:\u5fe1\ufcaf\u3711\ub113\uc87f<Object>)), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), xor:int(ldc:int(20865), ldc:int(20870)))), var_5_66:int), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), and:int(ldc:int(1829), ldc:int(16389)))))))
            }
        }
    }
    
    private void \u6c56\u3e75\u516c\u76bc\u7bad\u647c(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5fe1\ufcaf\u3711\ub113\uc87f<T> p0, T p1) {
        var_5_6B : \u9af2\u7ce1\u927d\ud523\u3a62<T>
        
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
            var_5_6B = initobject:\u9af2\u7ce1\u927d\ud523\u3a62(\u9af2\u7ce1\u927d\ud523\u3a62::<init>, p0:\u5fe1\ufcaf\u3711\ub113\uc87f<Object>, p1:T[expected:Object])
            invokeinterface:void(Lock::lock, invokeinterface:Lock(ReadWriteLock::writeLock, getfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
            invokeinterface:\u9af2\u7ce1\u927d\ud523\u3a62<?>(Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>::put, getfield:Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>(\u7c6b\u9937\u1187\u624e\u3dd3::\u3bd6\u72f1\u97b7\u4d85\ub113\ub32d, this:\u7c6b\u9937\u1187\u624e\u3dd3), invokestatic:Integer(Integer::valueOf, invokevirtual:int(\u5fe1\ufcaf\u3711\ub113\uc87f<T>::\u92ff\u2dcc\ub70c\u494c\u7af6\u6bb9, p0:\u5fe1\ufcaf\u3711\ub113\uc87f<Object>)), var_5_6B:\u9af2\u7ce1\u927d\ud523\u3a62<?>)
            putfield:boolean(\u7c6b\u9937\u1187\u624e\u3dd3::\u12b2\u51fa\u8d90\u69d9\u9937\u5654, this:\u7c6b\u9937\u1187\u624e\u3dd3, and:int[expected:boolean](ldc:int(9816), ldc:int(-26333)))
            invokeinterface:void(Lock::unlock, invokeinterface:Lock(ReadWriteLock::writeLock, getfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private \u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<T> \ub171\u6b0d\ub70c\u718f\uc7fe\u3e75(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5fe1\ufcaf\u3711\ub113\uc87f<T> p0) {
        var_2_61 : int
        var_2_E8 : int
        var_4_A6 : \u9af2\u7ce1\u927d\ud523\u3a62<?>
        var_6_F9 : \u1833\u88c5\u0b8e\uc9f6\u960f\u839e
        var_5_E1 : Throwable
        var_7_111 : \u446c\u67d0\ua562\u97b7\u6c56\u59ec
        var_2_15F : int
        
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
            var_2_61 = and:int(ldc:int(-2078808584), ldc:int(-1701121326))
            
            loop {
                if (cmpeq:boolean(and:int(var_2_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    var_2_E8 = and:int(var_2_61:int, ldc:int(-1001655246))
                    goto(Label_0134)
                }
                
                var_2_E8 = and:int(var_2_61:int, ldc:int(-456725166))
                invokeinterface:void(Lock::lock, invokeinterface:Lock(ReadWriteLock::readLock, getfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
                
                try {
                    Label_0134:
                    
                    if (cmpne:boolean(and:int(var_2_E8:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_2_E8 = and:int(var_2_E8:int, ldc:int(-1569276323))
                        var_4_A6 = checkcast:\u9af2\u7ce1\u927d\ud523\u3a62<?>(\u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<?>.class, invokeinterface:\u9af2\u7ce1\u927d\ud523\u3a62<?>(Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>::get, getfield:Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>(\u7c6b\u9937\u1187\u624e\u3dd3::\u3bd6\u72f1\u97b7\u4d85\ub113\ub32d, this:\u7c6b\u9937\u1187\u624e\u3dd3), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u5fe1\ufcaf\u3711\ub113\uc87f::\u92ff\u2dcc\ub70c\u494c\u7af6\u6bb9, p0:\u5fe1\ufcaf\u3711\ub113\uc87f))))
                        
                        do {
                            if (cmpne:boolean(and:int(var_2_E8:int, ldc:int(8388608)), ldc:int(0))) {
                                var_2_E8 = and:int(var_2_E8:int, ldc:int(-967900706))
                            }
                            else {
                                var_2_E8 = and:int(var_2_E8:int, ldc:int(-390745241))
                                invokeinterface:void(Lock::unlock, invokeinterface:Lock(ReadWriteLock::readLock, getfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
                            }
                        } while (cmpne:boolean(and:int(var_2_E8:int, ldc:int(4194304)), ldc:int(0)))
                        
                        var_2_E8 = and:int(var_2_E8:int, ldc:int(-459822740))
                        looporswitchbreak()
                    }
                    
                    loopcontinue()
                }
                catch (java.lang.Throwable var_5_E1) {
                    var_2_E8 = and:int(var_2_E8:int, ldc:int(-1276678798))
                    var_6_F9 = invokestatic:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\ubcb0\u59ec\u6d99\u156b\u0800\u946b, var_5_E1:Throwable, loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), and:int(ldc:int(6858), ldc:int(1052))))
                    var_2_E8 = and:int(var_2_E8:int, ldc:int(-1690289946))
                    var_7_111 = invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\u1833\u88c5\u0b8e\uc9f6\u960f\u839e::\u8c8a\u6b0d\uae87\u7330\u446c\uc9f6, var_6_F9:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e, loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), and:int(ldc:int(137), ldc:int(16415))))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_2_E8:int, ldc:int(64)), ldc:int(0))) {
                            var_2_E8 = and:int(var_2_E8:int, ldc:int(-773472936))
                            invokevirtual:\u446c\u67d0\ua562\u97b7\u6c56\u59ec(\u446c\u67d0\ua562\u97b7\u6c56\u59ec::\u7af6\u67d0\ub113\u4daf\u12b2\ufcaf, var_7_111:\u446c\u67d0\ua562\u97b7\u6c56\u59ec, loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), xor:int(ldc:int(656), ldc:int(666))), p0:\u5fe1\ufcaf\u3711\ub113\uc87f[expected:Object])
                        }
                        
                        if (cmpeq:boolean(and:int(var_2_E8:int, ldc:int(8388608)), ldc:int(0))) {
                            looporswitchbreak()
                        }
                        
                        var_2_E8 = and:int(var_2_E8:int, ldc:int(659392700))
                    }
                    
                    var_2_E8 = and:int(var_2_E8:int, ldc:int(-1944817825))
                    athrow(initobject:\uceb8\u8258\uf9c5\uc229\u7330\ucfaf(\uceb8\u8258\uf9c5\uc229\u7330\ucfaf::<init>, var_6_F9:\u1833\u88c5\u0b8e\uc9f6\u960f\u839e))
                }
                finally {
                    var_2_15F = and:int(var_2_E8:int, ldc:int(-2002721598))
                    invokeinterface:void(Lock::unlock, invokeinterface:Lock(ReadWriteLock::readLock, getfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
                    var_2_61 = and:int(var_2_15F:int, ldc:int(-1868612532))
                }
                
                looporswitchbreak()
            }
            
            return:\u9af2\u7ce1\u927d\ud523\u3a62<T>(var_4_A6:\u9af2\u7ce1\u927d\ud523\u3a62<?>)
        }
        
        goto(Label_0006)
    }
    
    public T \u759a\u52d3\u64ab\u4f52\u67d0\u156b(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5fe1\ufcaf\u3711\ub113\uc87f<T> p0) {
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
            return:T(invokevirtual:T(\u9af2\u7ce1\u927d\ud523\u3a62<T>::\ub6ab\u97e6\u4492\uc3e3\u965f\u1187, invokespecial:\u9af2\u7ce1\u927d\ud523\u3a62<T>(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u6b0d\ub70c\u718f\uc7fe\u3e75, this:\u7c6b\u9937\u1187\u624e\u3dd3, p0:\u5fe1\ufcaf\u3711\ub113\uc87f<T>)))
        }
        
        goto(Label_0006)
    }
    
    public void \ubb2b\u839e\u839e\u7d52\ubded\u9937(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\ub19c\u416d\uc84e\u8389\u12cb.\u5fe1\ufcaf\u3711\ub113\uc87f<T> p0, T p1) {
        var_5_67 : \u9af2\u7ce1\u927d\ud523\u3a62<T>
        
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
            var_5_67 = invokespecial:\u9af2\u7ce1\u927d\ud523\u3a62<T>(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u6b0d\ub70c\u718f\uc7fe\u3e75, this:\u7c6b\u9937\u1187\u624e\u3dd3, p0:\u5fe1\ufcaf\u3711\ub113\uc87f<T>)
            
            if (invokestatic:boolean(ObjectUtils::notEqual, p1:T[expected:Object], invokevirtual:T(\u9af2\u7ce1\u927d\ud523\u3a62<T>::\ub6ab\u97e6\u4492\uc3e3\u965f\u1187, var_5_67:\u9af2\u7ce1\u927d\ud523\u3a62<T>))) {
                invokevirtual:void(\u9af2\u7ce1\u927d\ud523\u3a62<T>::\u9af2\u760c\ud217\u6cfe\ub32d\ud523, var_5_67:\u9af2\u7ce1\u927d\ud523\u3a62<T>, p1:T)
                invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u64f2\u8aa5\u6fb0\u5654\ud51e\uae87, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\u7c6b\u9937\u1187\u624e\u3dd3::\uf94d\ube23\u516c\uc238\u7873\u6c56, this:\u7c6b\u9937\u1187\u624e\u3dd3), p0:\u5fe1\ufcaf\u3711\ub113\uc87f<T>)
                invokevirtual:void(\u9af2\u7ce1\u927d\ud523\u3a62::\u34df\u6bb9\ub113\u8389\u1187\ua3b4, var_5_67:\u9af2\u7ce1\u927d\ud523\u3a62, xor:int[expected:boolean](ldc:int(-31872), ldc:int(-31871)))
                putfield:boolean(\u7c6b\u9937\u1187\u624e\u3dd3::\u4bc8\uc3e3\u12cb\u16f6\u527a\ucef1, this:\u7c6b\u9937\u1187\u624e\u3dd3, xor:int[expected:boolean](ldc:int(264), ldc:int(265)))
            }
            
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u67d0\u6c52\ua61f\u392e\u6d69\u3776() {
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
            return:boolean(getfield:boolean(\u7c6b\u9937\u1187\u624e\u3dd3::\u4bc8\uc3e3\u12cb\u16f6\u527a\ucef1, this:\u7c6b\u9937\u1187\u624e\u3dd3))
        }
        
        goto(Label_0006)
    }
    
    public static void \ub83f\u385b\u4c2b\u16f6\u836c\uc7fe(java.util.List<\u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<?>> p0, \u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p1) {
        var_2_61 : int
        var_4_84 : int
        var_5_8C : int
        
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
            var_2_61 = and:int(ldc:int(1201358969), ldc:int(1182750579))
            
            if (cmpne:boolean(p0:List<\u9af2\u7ce1\u927d\ud523\u3a62<T>>, aconstnull:List<\u9af2\u7ce1\u927d\ud523\u3a62<T>>())) {
                var_4_84 = and:int(ldc:int(-23662), ldc:int(23660))
                var_5_8C = invokeinterface:int(List<E>::size, p0:List<\u9af2\u7ce1\u927d\ud523\u3a62<T>>)
                
                loop {
                    var_2_61 = and:int(var_2_61:int, ldc:int(-1762401211))
                    
                    if (cmpge:boolean(var_4_84:int, var_5_8C:int)) {
                        looporswitchbreak()
                    }
                    
                    invokestatic:void(\u7c6b\u9937\u1187\u624e\u3dd3::\u71ae\u9a18\u47c2\uc229\u6d99\ud217, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, checkcast:\u9af2\u7ce1\u927d\ud523\u3a62<T>(\u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<T>.class, invokeinterface:\u9af2\u7ce1\u927d\ud523\u3a62<T>(List<\u9af2\u7ce1\u927d\ud523\u3a62<T>>::get, p0:List<\u9af2\u7ce1\u927d\ud523\u3a62<T>>, var_4_84:int)))
                    inc:int(var_4_84, ldc:int(1))
                }
            }
            
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeByte, p1:\u98a4\uafe7\uc3e3\ua6bd\u8640, xor:int(ldc:int(-24502), ldc:int(-24395)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<?>> \u8df4\u759a\u3bd6\uc31c\uc238\u6bb9() {
        var_3_63 : List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>
        var_4_98 : Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>
        var_5_C3 : \u9af2\u7ce1\u927d\ud523\u3a62<?>
        
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
            var_3_63 = aconstnull:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>()
            
            if (getfield:boolean(\u7c6b\u9937\u1187\u624e\u3dd3::\u4bc8\uc3e3\u12cb\u16f6\u527a\ucef1, this:\u7c6b\u9937\u1187\u624e\u3dd3)) {
                invokeinterface:void(Lock::lock, invokeinterface:Lock(ReadWriteLock::readLock, getfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
                var_4_98 = invokeinterface:Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>(Collection<\u9af2\u7ce1\u927d\ud523\u3a62<?>>::iterator, invokeinterface:Collection<\u9af2\u7ce1\u927d\ud523\u3a62<?>>(Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>::values, getfield:Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>(\u7c6b\u9937\u1187\u624e\u3dd3::\u3bd6\u72f1\u97b7\u4d85\ub113\ub32d, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
                
                while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_98:Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>)) {
                    var_5_C3 = checkcast:\u9af2\u7ce1\u927d\ud523\u3a62<?>(\u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<?>.class, invokeinterface:\u9af2\u7ce1\u927d\ud523\u3a62<?>(Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>::next, var_4_98:Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\u9af2\u7ce1\u927d\ud523\u3a62<T>::\u946b\u071d\uc7fe\ud36e\uae87\u9a18, var_5_C3:\u9af2\u7ce1\u927d\ud523\u3a62<?>))) {
                        loopcontinue()
                    }
                    
                    invokevirtual:void(\u9af2\u7ce1\u927d\ud523\u3a62<T>::\u34df\u6bb9\ub113\u8389\u1187\ua3b4, var_5_C3:\u9af2\u7ce1\u927d\ud523\u3a62<?>, and:int[expected:boolean](ldc:int(21585), ldc:int(-21588)))
                    
                    if (cmpeq:boolean(var_3_63:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>, aconstnull:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>())) {
                        var_3_63 = invokestatic:ArrayList[expected:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>](Lists::newArrayList)
                    }
                    
                    invokeinterface:boolean(List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>::add, var_3_63:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>, invokevirtual:\u9af2\u7ce1\u927d\ud523\u3a62<?>(\u9af2\u7ce1\u927d\ud523\u3a62<?>::\u69d9\ub18d\u4179\u3dd3\u67e9\u4bc8, var_5_C3:\u9af2\u7ce1\u927d\ud523\u3a62<?>))
                }
                
                invokeinterface:void(Lock::unlock, invokeinterface:Lock(ReadWriteLock::readLock, getfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
            }
            
            putfield:boolean(\u7c6b\u9937\u1187\u624e\u3dd3::\u4bc8\uc3e3\u12cb\u16f6\u527a\ucef1, this:\u7c6b\u9937\u1187\u624e\u3dd3, and:int[expected:boolean](ldc:int(7729), ldc:int(-15922)))
            return:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>(var_3_63:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>)
        }
        
        goto(Label_0006)
    }
    
    public java.util.List<\u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<?>> \u5bc4\ub19c\u5654\u71ae\u64f2\u3776() {
        var_3_63 : List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>
        var_4_80 : Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>
        var_5_AA : \u9af2\u7ce1\u927d\ud523\u3a62<?>
        
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
            var_3_63 = aconstnull:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>()
            invokeinterface:void(Lock::lock, invokeinterface:Lock(ReadWriteLock::readLock, getfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
            var_4_80 = invokeinterface:Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>(Collection<\u9af2\u7ce1\u927d\ud523\u3a62<?>>::iterator, invokeinterface:Collection<\u9af2\u7ce1\u927d\ud523\u3a62<?>>(Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>::values, getfield:Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>(\u7c6b\u9937\u1187\u624e\u3dd3::\u3bd6\u72f1\u97b7\u4d85\ub113\ub32d, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
            
            while (invokeinterface:boolean(Iterator<E>::hasNext, var_4_80:Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>)) {
                var_5_AA = checkcast:\u9af2\u7ce1\u927d\ud523\u3a62<?>(\u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<?>.class, invokeinterface:\u9af2\u7ce1\u927d\ud523\u3a62<?>(Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>::next, var_4_80:Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>))
                
                if (cmpeq:boolean(var_3_63:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>, aconstnull:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>())) {
                    var_3_63 = invokestatic:ArrayList[expected:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>](Lists::newArrayList)
                }
                
                invokeinterface:boolean(List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>::add, var_3_63:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>, invokevirtual:\u9af2\u7ce1\u927d\ud523\u3a62<?>(\u9af2\u7ce1\u927d\ud523\u3a62<?>::\u69d9\ub18d\u4179\u3dd3\u67e9\u4bc8, var_5_AA:\u9af2\u7ce1\u927d\ud523\u3a62<?>))
            }
            
            invokeinterface:void(Lock::unlock, invokeinterface:Lock(ReadWriteLock::readLock, getfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
            return:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>(var_3_63:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>)
        }
        
        goto(Label_0006)
    }
    
    private static void \u71ae\u9a18\u47c2\uc229\u6d99\ud217(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0, \u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<T> p1) {
        var_4_66 : \u5fe1\ufcaf\u3711\ub113\uc87f<T>
        var_5_70 : int
        
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
        var_4_66 = invokevirtual:\u5fe1\ufcaf\u3711\ub113\uc87f<T>(\u9af2\u7ce1\u927d\ud523\u3a62<T>::\u494c\u2dcc\u6b0d\ud171\ubb2b\ud4fe, p1:\u9af2\u7ce1\u927d\ud523\u3a62<T>)
        var_5_70 = invokestatic:int(\u3dd3\u4f4a\u64ab\ubb2b\ud12e::\u97b7\u36d3\u98a4\uc84e\ubff1\ub83f, invokevirtual:\uc2bd\u8413\ua068\u6bb9\u183a<T>(\u5fe1\ufcaf\u3711\ub113\uc87f<T>::\u7af6\ub7dc\u12b2\u7330\u9af2\u647c, var_4_66:\u5fe1\ufcaf\u3711\ub113\uc87f<T>))
        
        if (cmpge:boolean(var_5_70:int, ldc:int(0))) {
            invokevirtual:ByteBuf(\u98a4\uafe7\uc3e3\ua6bd\u8640::writeByte, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:int(\u5fe1\ufcaf\u3711\ub113\uc87f::\u92ff\u2dcc\ub70c\u494c\u7af6\u6bb9, var_4_66:\u5fe1\ufcaf\u3711\ub113\uc87f<T>))
            invokevirtual:\u98a4\uafe7\uc3e3\ua6bd\u8640(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u927d\u718f\u494c\u6c56\u52d3\u36d3, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, var_5_70:int)
            invokeinterface:void(\uc2bd\u8413\ua068\u6bb9\u183a<T>::\u3bc9\u0c95\u960f\u7bad\uceb8\u6bb9, invokevirtual:\uc2bd\u8413\ua068\u6bb9\u183a<T>(\u5fe1\ufcaf\u3711\ub113\uc87f<T>::\u7af6\ub7dc\u12b2\u7330\u9af2\u647c, var_4_66:\u5fe1\ufcaf\u3711\ub113\uc87f<T>), p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, invokevirtual:T(\u9af2\u7ce1\u927d\ud523\u3a62<T>::\ub6ab\u97e6\u4492\uc3e3\u965f\u1187, p1:\u9af2\u7ce1\u927d\ud523\u3a62<T>))
            return:void()
        }
        
        athrow(initobject:EncoderException(EncoderException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), and:int(ldc:int(4175), ldc:int(25611)))), invokevirtual:\uc2bd\u8413\ua068\u6bb9\u183a<T>(\u5fe1\ufcaf\u3711\ub113\uc87f<T>::\u7af6\ub7dc\u12b2\u7330\u9af2\u647c, var_4_66:\u5fe1\ufcaf\u3711\ub113\uc87f<T>)))))
    }
    
    public static java.util.List<\u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<?>> \uceb8\ub171\u64f2\u9033\u7330\u4975(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0) {
        var_3_63 : List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>
        var_4_69 : short
        var_5_83 : int
        var_6_8A : \uc2bd\u8413\ua068\u6bb9\u183a<?>
        
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
            var_3_63 = aconstnull:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>()
            
            while (cmpne:boolean(var_4_69 = invokevirtual:short(\u98a4\uafe7\uc3e3\ua6bd\u8640::readUnsignedByte, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640), xor:int(ldc:int(-32757), ldc:int(-32524)))) {
                if (cmpeq:boolean(var_3_63:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>, aconstnull:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>())) {
                    var_3_63 = invokestatic:ArrayList[expected:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>](Lists::newArrayList)
                }
                
                var_5_83 = invokevirtual:int(\u98a4\uafe7\uc3e3\ua6bd\u8640::\u6bb9\ub19c\u760c\ucef1\u3776\uf9c5, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)
                var_6_8A = invokestatic:\uc2bd\u8413\ua068\u6bb9\u183a<?>(\u3dd3\u4f4a\u64ab\ubb2b\ud12e::\u4cd9\u873d\u4c2b\u52d3\ube23\ud12e, var_5_83:int)
                
                if (cmpeq:boolean(var_6_8A:\uc2bd\u8413\ua068\u6bb9\u183a<?>, aconstnull:\uc2bd\u8413\ua068\u6bb9\u183a<?>())) {
                    athrow(initobject:DecoderException(DecoderException::<init>, invokevirtual:String(StringBuilder::toString, invokevirtual:StringBuilder(StringBuilder::append, invokevirtual:StringBuilder(StringBuilder::append, initobject:StringBuilder(StringBuilder::<init>), loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), and:int(ldc:int(2287), ldc:int(12299)))), var_5_83:int))))
                }
                
                invokeinterface:boolean(List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>::add, var_3_63:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>, invokestatic:\u9af2\u7ce1\u927d\ud523\u3a62<?>(\u7c6b\u9937\u1187\u624e\u3dd3::\u7ce1\u7006\u965f\u62da\uc87f\u1833, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640, var_4_69:short[expected:int], var_6_8A:\uc2bd\u8413\ua068\u6bb9\u183a<T>))
            }
            
            return:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>(var_3_63:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>)
        }
        
        goto(Label_0006)
    }
    
    private static \u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<T> \u7ce1\u7006\u965f\u62da\uc87f\u1833(\u12b2\u4e72\u8df4\u67e9\u67e9.\u98a4\uafe7\uc3e3\ua6bd\u8640 p0, int p1, \ud36e\u6bb9\u960f\u4c04\u64ab.\uc2bd\u8413\ua068\u6bb9\u183a<T> p2) {
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
            return:\u9af2\u7ce1\u927d\ud523\u3a62<T>(initobject:\u9af2\u7ce1\u927d\ud523\u3a62<T>(\u9af2\u7ce1\u927d\ud523\u3a62<T>::<init>, invokeinterface:\u5fe1\ufcaf\u3711\ub113\uc87f<T>(\uc2bd\u8413\ua068\u6bb9\u183a<T>::\u4d85\uc87f\ufe34\u8350\ua068\u2dcc, p2:\uc2bd\u8413\ua068\u6bb9\u183a<T>, p1:int), invokeinterface:T(\uc2bd\u8413\ua068\u6bb9\u183a<T>::\ub32d\u071d\ucef1\u6cfe\u718f\u9a18, p2:\uc2bd\u8413\ua068\u6bb9\u183a<T>, p0:\u98a4\uafe7\uc3e3\ua6bd\u8640)))
        }
        
        goto(Label_0006)
    }
    
    public void \u6198\u6c52\uc9f6\ud51e\u7873\u7af6(java.util.List<\u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<?>> p0) {
        var_2_85 : int
        var_4_76 : Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>
        var_5_CE : \u9af2\u7ce1\u927d\ud523\u3a62<?>
        var_6_E7 : \u9af2\u7ce1\u927d\ud523\u3a62<?>
        
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
            var_2_85 = and:int(ldc:int(27112101), ldc:int(-101725410))
            invokeinterface:void(Lock::lock, invokeinterface:Lock(ReadWriteLock::writeLock, getfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
            var_4_76 = invokeinterface:Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>(List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>::iterator, p0:List<\u9af2\u7ce1\u927d\ud523\u3a62<?>>)
            
            loop {
                if (cmpeq:boolean(and:int(var_2_85:int, ldc:int(64)), ldc:int(0))) {
                    var_2_85 = and:int(var_2_85:int, ldc:int(-874030454))
                    
                    if (invokeinterface:boolean(Iterator<E>::hasNext, var_4_76:Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>)) {
                        var_5_CE = checkcast:\u9af2\u7ce1\u927d\ud523\u3a62<?>(\u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<?>.class, invokeinterface:\u9af2\u7ce1\u927d\ud523\u3a62<?>(Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>::next, var_4_76:Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>))
                        var_6_E7 = checkcast:\u9af2\u7ce1\u927d\ud523\u3a62<?>(\u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<?>.class, invokeinterface:\u9af2\u7ce1\u927d\ud523\u3a62<?>(Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>::get, getfield:Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>(\u7c6b\u9937\u1187\u624e\u3dd3::\u3bd6\u72f1\u97b7\u4d85\ub113\ub32d, this:\u7c6b\u9937\u1187\u624e\u3dd3), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u5fe1\ufcaf\u3711\ub113\uc87f<T>::\u92ff\u2dcc\ub70c\u494c\u7af6\u6bb9, invokevirtual:\u5fe1\ufcaf\u3711\ub113\uc87f<?>(\u9af2\u7ce1\u927d\ud523\u3a62<?>::\u494c\u2dcc\u6b0d\ud171\ubb2b\ud4fe, var_5_CE:\u9af2\u7ce1\u927d\ud523\u3a62<?>)))))
                        
                        if (cmpne:boolean(var_6_E7:\u9af2\u7ce1\u927d\ud523\u3a62<?>, aconstnull:\u9af2\u7ce1\u927d\ud523\u3a62<?>())) {
                            invokespecial:void(\u7c6b\u9937\u1187\u624e\u3dd3::\u960f\u8258\u76bc\u0b8e\ubb2b\uc7fe, this:\u7c6b\u9937\u1187\u624e\u3dd3, var_6_E7:\u9af2\u7ce1\u927d\ud523\u3a62<Object>, var_5_CE:\u9af2\u7ce1\u927d\ud523\u3a62<?>)
                            invokevirtual:void(\u7d52\u718f\u3776\u6fb0\ub83f::\u64f2\u8aa5\u6fb0\u5654\ud51e\uae87, getfield:\u7d52\u718f\u3776\u6fb0\ub83f(\u7c6b\u9937\u1187\u624e\u3dd3::\uf94d\ube23\u516c\uc238\u7873\u6c56, this:\u7c6b\u9937\u1187\u624e\u3dd3), invokevirtual:\u5fe1\ufcaf\u3711\ub113\uc87f<?>(\u9af2\u7ce1\u927d\ud523\u3a62<?>::\u494c\u2dcc\u6b0d\ud171\ubb2b\ud4fe, var_5_CE:\u9af2\u7ce1\u927d\ud523\u3a62<?>))
                        }
                        
                        var_2_85 = and:int(var_2_85:int, ldc:int(1072652068))
                        loopcontinue()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_2_85:int, ldc:int(134217728)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_2_85 = and:int(var_2_85:int, ldc:int(754010834))
            }
            
            invokeinterface:void(Lock::unlock, invokeinterface:Lock(ReadWriteLock::writeLock, getfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
            putfield:boolean(\u7c6b\u9937\u1187\u624e\u3dd3::\u4bc8\uc3e3\u12cb\u16f6\u527a\ucef1, this:\u7c6b\u9937\u1187\u624e\u3dd3, xor:int[expected:boolean](ldc:int(8451), ldc:int(8450)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private void \u960f\u8258\u76bc\u0b8e\ubb2b\uc7fe(\u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<T> p0, \u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<?> p1) {
        stack_F7_0 : String [generated]
        expr_9A : Object[] [generated]
        
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
        
        if (invokestatic:boolean(Objects::equals, invokevirtual:\uc2bd\u8413\ua068\u6bb9\u183a[expected:Object](\u5fe1\ufcaf\u3711\ub113\uc87f::\u7af6\ub7dc\u12b2\u7330\u9af2\u647c, invokestatic:\u5fe1\ufcaf\u3711\ub113\uc87f(\u9af2\u7ce1\u927d\ud523\u3a62<Object>::\u51fa\u120d\u8258\u3bd6\uc246\uc229, p1:\u9af2\u7ce1\u927d\ud523\u3a62<Object>)), invokevirtual:\uc2bd\u8413\ua068\u6bb9\u183a[expected:Object](\u5fe1\ufcaf\u3711\ub113\uc87f::\u7af6\ub7dc\u12b2\u7330\u9af2\u647c, invokestatic:\u5fe1\ufcaf\u3711\ub113\uc87f(\u9af2\u7ce1\u927d\ud523\u3a62<Object>::\u51fa\u120d\u8258\u3bd6\uc246\uc229, p0:\u9af2\u7ce1\u927d\ud523\u3a62<Object>)))) {
            invokevirtual:void(\u9af2\u7ce1\u927d\ud523\u3a62<T>::\u9af2\u760c\ud217\u6cfe\ub32d\ud523, p0:\u9af2\u7ce1\u927d\ud523\u3a62<T>, invokevirtual:T(\u9af2\u7ce1\u927d\ud523\u3a62<T>::\ub6ab\u97e6\u4492\uc3e3\u965f\u1187, p1:\u9af2\u7ce1\u927d\ud523\u3a62<T>))
            return:void()
        }
        
        stack_F7_0 = loadelement:String(getstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd), xor:int(ldc:int(4359), ldc:int(4363)))
        expr_9A = newarray:Object[](java.lang.Object.class, ldc:int(6))
        storeelement:Object(expr_9A:Object[], and:int(ldc:int(-29554), ldc:int(865)), invokestatic:Integer[expected:Object](Integer::valueOf, invokevirtual:int(\u5fe1\ufcaf\u3711\ub113\uc87f::\u92ff\u2dcc\ub70c\u494c\u7af6\u6bb9, invokestatic:\u5fe1\ufcaf\u3711\ub113\uc87f(\u9af2\u7ce1\u927d\ud523\u3a62<Object>::\u51fa\u120d\u8258\u3bd6\uc246\uc229, p0:\u9af2\u7ce1\u927d\ud523\u3a62<Object>))))
        storeelement:Object(expr_9A:Object[], xor:int(ldc:int(10308), ldc:int(10309)), getfield:\u7d52\u718f\u3776\u6fb0\ub83f[expected:Object](\u7c6b\u9937\u1187\u624e\u3dd3::\uf94d\ube23\u516c\uc238\u7873\u6c56, this:\u7c6b\u9937\u1187\u624e\u3dd3))
        storeelement:Object(expr_9A:Object[], xor:int(ldc:int(-32712), ldc:int(-32710)), invokestatic:Object(\u9af2\u7ce1\u927d\ud523\u3a62<Object>::\u183a\u873d\u3c25\ubf56\u40a9\ua3b4, p0:\u9af2\u7ce1\u927d\ud523\u3a62<Object>))
        storeelement:Object(expr_9A:Object[], xor:int(ldc:int(137), ldc:int(138)), invokevirtual:Class<?>[expected:Object](Object::getClass, invokestatic:Object(\u9af2\u7ce1\u927d\ud523\u3a62<Object>::\u183a\u873d\u3c25\ubf56\u40a9\ua3b4, p0:\u9af2\u7ce1\u927d\ud523\u3a62<Object>)))
        storeelement:Object(expr_9A:Object[], xor:int(ldc:int(-31871), ldc:int(-31867)), invokestatic:Object(\u9af2\u7ce1\u927d\ud523\u3a62<Object>::\u183a\u873d\u3c25\ubf56\u40a9\ua3b4, p1:\u9af2\u7ce1\u927d\ud523\u3a62<Object>))
        storeelement:Object(expr_9A:Object[], xor:int(ldc:int(-32237), ldc:int(-32234)), invokevirtual:Class<?>[expected:Object](Object::getClass, invokestatic:Object(\u9af2\u7ce1\u927d\ud523\u3a62<Object>::\u183a\u873d\u3c25\ubf56\u40a9\ua3b4, p1:\u9af2\u7ce1\u927d\ud523\u3a62<Object>)))
        athrow(initobject:IllegalStateException(IllegalStateException::<init>, invokestatic:String(String::format, stack_F7_0:String, expr_9A:Object[])))
    }
    
    public boolean \u8c8a\ub171\u3e75\u6ec6\u5245\ud12e() {
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
            return:boolean(getfield:boolean(\u7c6b\u9937\u1187\u624e\u3dd3::\u12b2\u51fa\u8d90\u69d9\u9937\u5654, this:\u7c6b\u9937\u1187\u624e\u3dd3))
        }
        
        goto(Label_0006)
    }
    
    public void \uc2e8\u9937\u1833\u3dd3\u516c\u3bc9() {
        var_1_61 : int
        var_3_89 : Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>
        
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
            var_1_61 = and:int(ldc:int(1762419666), ldc:int(-1617249837))
            putfield:boolean(\u7c6b\u9937\u1187\u624e\u3dd3::\u4bc8\uc3e3\u12cb\u16f6\u527a\ucef1, this:\u7c6b\u9937\u1187\u624e\u3dd3, and:int[expected:boolean](ldc:int(-30287), ldc:int(13894)))
            invokeinterface:void(Lock::lock, invokeinterface:Lock(ReadWriteLock::readLock, getfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
            var_3_89 = invokeinterface:Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>(Collection<\u9af2\u7ce1\u927d\ud523\u3a62<?>>::iterator, invokeinterface:Collection<\u9af2\u7ce1\u927d\ud523\u3a62<?>>(Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>::values, getfield:Map<Integer, \u9af2\u7ce1\u927d\ud523\u3a62<?>>(\u7c6b\u9937\u1187\u624e\u3dd3::\u3bd6\u72f1\u97b7\u4d85\ub113\ub32d, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
            
            loop {
                var_1_61 = and:int(var_1_61:int, ldc:int(461357522))
                
                if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_3_89:Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>))) {
                    looporswitchbreak()
                }
                
                invokevirtual:void(\u9af2\u7ce1\u927d\ud523\u3a62<T>::\u34df\u6bb9\ub113\u8389\u1187\ua3b4, checkcast:\u9af2\u7ce1\u927d\ud523\u3a62<?>(\u56bd\u8413\u647c\u5bc4\ud158.\u9af2\u7ce1\u927d\ud523\u3a62<?>.class, invokeinterface:\u9af2\u7ce1\u927d\ud523\u3a62<?>(Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>::next, var_3_89:Iterator<\u9af2\u7ce1\u927d\ud523\u3a62<?>>)), and:int[expected:boolean](ldc:int(-11948), ldc:int(9771)))
            }
            
            invokeinterface:void(Lock::unlock, invokeinterface:Lock(ReadWriteLock::readLock, getfield:ReadWriteLock(\u7c6b\u9937\u1187\u624e\u3dd3::\ub171\u67e9\u3776\u76bc\u7043\u4ab3, this:\u7c6b\u9937\u1187\u624e\u3dd3)))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_2C9 : int
        expr_6E : int [generated]
        stack_9B_0 : byte[] [generated]
        stack_9D_0 : byte[] [generated]
        stack_C2_0 : byte[] [generated]
        stack_C4_0 : byte[] [generated]
        stack_F1_0 : byte[] [generated]
        stack_F3_0 : byte[] [generated]
        stack_11E_0 : byte[] [generated]
        stack_2DC_0 : byte[] [generated]
        stack_344_0 : byte[] [generated]
        stack_3BD_0 : byte[] [generated]
        stack_413_0 : byte[] [generated]
        var_4_2B4 : int
        var_3_2B9 : byte[]
        var_5_2BA : int
        expr_2DC : byte [generated]
        var_0_33A : int
        expr_344 : byte [generated]
        stack_38B_2 : byte [generated]
        stack_369_0 : byte [generated]
        expr_9D : int [generated]
        var_2_C2 : byte[]
        expr_C6 : int [generated]
        var_3_3AB : byte[]
        var_5_3AC : int
        expr_F3 : int [generated]
        var_3_401 : byte[]
        var_5_402 : int
        var_3_12A : String
        stack_2A1_0 : String[] [generated]
        expr_13C : String[] [generated]
        
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
        var_0_2C9 = and:int(ldc:int(-1618687179), ldc:int(-1982988491))
        expr_6E = arraylength:int(stack_9B_0 = stack_9D_0 = stack_C2_0 = stack_C4_0 = stack_F1_0 = stack_F3_0 = stack_11E_0 = stack_2DC_0 = stack_344_0 = stack_3BD_0 = stack_413_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("s9pZ1bOukJq2prjRvk45k5TGyM7CHSohSLg0MBE0Uzs4Uxk+3Zi0u7i6v7m2ujS6FN5COTqeoDy/Mr7YPL7SGbO2njRTO7W1MMo6t52kvT5RsL0xHzk4sNc8OD6SPjNRsDkwGUo8MLmqPTnTOzY8kj4zUbA5MBlauL66nFA3urQdXLAwNzC6urkVsNtXutaYH16YPDufPjNR0LhXOpq9GrFYt1u8nt+3vDkZmD1YN982nt+nHbQZpTiw1zw4PpI+M1GwOTAZSjIwMyC1Pl21vLOcPrM/NzK82ze5tJtcwLi3ECyxOTozuz610jk6up8+sz83MrzbN7G6lD69yj1Ztae2nrC9XbS1vb/VubAxn7s3kVC5PuMDqC76")))
        
        if (cmpeq:boolean(expr_6E:int, ldc:int(0))) {
            goto(Label_0115)
        }
        
        var_4_2B4 = expr_6E:int
        var_3_2B9 = newarray:byte[](byte.class, expr_6E:int)
        var_5_2BA = expr_6E:int
        Label_0700:
        
        while (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(65536)), ldc:int(0))) {
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-307503177))
            var_5_2BA = add:int(var_5_2BA:int, ldc:int(-1))
            expr_2DC = loadelement:byte(stack_2DC_0:byte[], var_5_2BA:int)
            storeelement:byte(var_3_2B9:byte[], var_5_2BA:int, add:int(or:int(and:int(shl:int(expr_2DC:byte, and:int(ldc:int(23508), ldc:int(13))), ldc:int(-16)), and:int(shr:int(expr_2DC:byte[expected:int], xor:int(ldc:int(-30576), ldc:int(-30572))), ldc:int(15))), ldc:int(85)))
            
            if (cmpne:boolean(var_5_2BA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_C2_0 = stack_C4_0 = stack_F1_0 = stack_F3_0 = stack_11E_0 = stack_2DC_0 = stack_344_0 = stack_3BD_0 = stack_413_0 = var_3_2B9:byte[]
            goto(Label_0115)
        }
        
        var_0_2C9 = and:int(var_0_2C9:int, ldc:int(1792545595))
        Label_0804:
        
        while (cmpne:boolean(and:int(var_0_2C9:int, ldc:int(2048)), ldc:int(0))) {
            var_0_33A = and:int(var_0_2C9:int, ldc:int(-1646665739))
            var_5_2BA = add:int(var_5_2BA:int, ldc:int(-1))
            expr_344 = stack_38B_2 = loadelement(stack_344_0, var_5_2BA)
            
            if (cmplt:boolean(add:int(add:int(var_5_2BA:int, ldc:int(4)), neg:int(var_4_2B4:int)), ldc:int(0))) {
                stack_38B_2 = stack_369_0 = add:byte(expr_344:byte, loadelement:byte(var_3_2B9:byte[], add:int(var_5_2BA:int, ldc:int(4))))
                goto(Label_0889)
            }
            
            Label_0849:
            
            if (cmpeq:boolean(and:int(var_0_33A:int, ldc:int(512)), ldc:int(0))) {
                var_0_33A = and:int(var_0_33A:int, ldc:int(1289480766))
            }
            else {
                var_0_33A = and:int(var_0_33A:int, ldc:int(-269946985))
                stack_38B_2 = stack_369_0 = add:byte(expr_344:byte, ldc:byte(4))
            }
            
            Label_0889:
            
            if (cmpne:boolean(and:int(var_0_33A:int, ldc:int(4096)), ldc:int(0))) {
                goto(Label_0849)
            }
            
            var_0_2C9 = and:int(var_0_33A:int, ldc:int(-1880826953))
            storeelement:byte(var_3_2B9:byte[], var_5_2BA:int, stack_38B_2:byte)
            
            if (cmpne:boolean(var_5_2BA:int, ldc:int(0))) {
                loopcontinue()
            }
            
            stack_9D_0 = stack_9B_0 = stack_C2_0 = stack_C4_0 = stack_F1_0 = stack_F3_0 = stack_11E_0 = stack_2DC_0 = stack_344_0 = stack_3BD_0 = stack_413_0 = var_3_2B9:byte[]
            goto(Label_0162)
        }
        
        var_0_2C9 = and:int(var_0_2C9:int, ldc:int(1311490556))
        goto(Label_0700)
        Label_0115:
        
        if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(8388608)), ldc:int(0))) {
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(2062740635))
            goto(Label_0248)
        }
        
        if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(1)), ldc:int(0))) {
            goto(Label_0203)
        }
        
        if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(2097152)), ldc:int(0))) {
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-105120931))
            expr_9D = arraylength:int(stack_9D_0:byte[])
            
            if (cmpne:boolean(expr_9D:int, ldc:int(0))) {
                var_4_2B4 = expr_9D:int
                var_3_2B9 = newarray:byte[](byte.class, expr_9D:int)
                var_5_2BA = expr_9D:int
                goto(Label_0804)
            }
        }
        
        Label_0162:
        
        if (cmpne:boolean(and:int(var_0_2C9:int, ldc:int(65536)), ldc:int(0))) {
            goto(Label_0248)
        }
        
        if (cmpne:boolean(and:int(var_0_2C9:int, ldc:int(4)), ldc:int(0))) {
            if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(2048)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-35205217))
            var_2_C2 = stack_C2_0:byte[]
            expr_C6 = add:int(arraylength:int(stack_C4_0:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_C6:int, ldc:int(0))) {
                var_3_3AB = newarray:byte[](byte.class, expr_C6:int)
                var_5_3AC = expr_C6:int
                
                loop {
                    var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-540680385))
                    var_5_3AC = add:int(var_5_3AC:int, ldc:int(-1))
                    storeelement:byte(var_3_3AB:byte[], var_5_3AC:int, add:int(shl:int(loadelement:byte(stack_3BD_0:byte[], var_5_3AC:int), ldc:int(5)), and:int(shr:int(loadelement:byte(var_2_C2:byte[], add:int(var_5_3AC:int, xor:int(ldc:int(2304), ldc:int(2305)))), ldc:int(3)), xor:int(ldc:int(-32390), ldc:int(-32411)))))
                    
                    if (cmpne:boolean(var_5_3AC:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_C2_0 = stack_C4_0 = stack_F1_0 = stack_F3_0 = stack_11E_0 = stack_2DC_0 = stack_344_0 = stack_3BD_0 = stack_413_0 = var_3_3AB:byte[]
            }
        }
        
        Label_0203:
        
        if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(2147483647)), ldc:int(0))) {
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-337108757))
        }
        else {
            if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0162)
            }
            
            if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(256)), ldc:int(0))) {
                goto(Label_0115)
            }
            
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-1778857))
            expr_F3 = arraylength:int(stack_F3_0:byte[])
            
            if (cmpne:boolean(expr_F3:int, ldc:int(0))) {
                var_3_401 = newarray:byte[](byte.class, expr_F3:int)
                var_5_402 = expr_F3:int
                
                loop {
                    var_0_2C9 = and:int(var_0_2C9:int, ldc:int(-1983198211))
                    var_5_402 = add:int(var_5_402:int, ldc:int(-1))
                    storeelement:byte(var_3_401:byte[], var_5_402:int, xor:byte(loadelement:byte(stack_413_0:byte[], var_5_402:int), ldc:byte(28)))
                    
                    if (cmpne:boolean(var_5_402:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9D_0 = stack_9B_0 = stack_C2_0 = stack_C4_0 = stack_F1_0 = stack_F3_0 = stack_11E_0 = stack_2DC_0 = stack_344_0 = stack_3BD_0 = stack_413_0 = var_3_401:byte[]
            }
        }
        
        Label_0248:
        
        if (cmpne:boolean(and:int(var_0_2C9:int, ldc:int(524288)), ldc:int(0))) {
            goto(Label_0203)
        }
        
        if (cmpeq:boolean(and:int(var_0_2C9:int, ldc:int(8388608)), ldc:int(0))) {
            goto(Label_0162)
        }
        
        if (cmpne:boolean(and:int(var_0_2C9:int, ldc:int(1024)), ldc:int(0))) {
            var_0_2C9 = and:int(var_0_2C9:int, ldc:int(1285874209))
            goto(Label_0115)
        }
        
        var_3_12A = initobject:String(String::<init>, stack_11E_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
        stack_2A1_0 = newarray:String[](Ljava.lang.String.class, and:int(ldc:int(16413), ldc:int(10317)))
        expr_13C = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(5149), ldc:int(5136)))
        storeelement:String(expr_13C:String[], and:int(ldc:int(16391), ldc:int(9735)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(6401), ldc:int(-6402)), xor:int(ldc:int(-14335), ldc:int(-14332))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(3245), ldc:int(24853)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(24839), ldc:int(2149)), xor:int(ldc:int(28), ldc:int(26))))
        storeelement:String(expr_13C:String[], xor:int(ldc:int(2640), ldc:int(2642)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(519), ldc:int(2278)), and:int(ldc:int(48), ldc:int(25104))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(25635), ldc:int(4099)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(18569), ldc:int(18585)), and:int(ldc:int(29715), ldc:int(25))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(2826), ldc:int(12427)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(-30200), ldc:int(-30183)), and:int(ldc:int(16474), ldc:int(3001))))
        storeelement:String(expr_13C:String[], xor:int(ldc:int(13314), ldc:int(13315)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(2136), ldc:int(20792)), and:int(ldc:int(1086), ldc:int(54))))
        storeelement:String(expr_13C:String[], xor:int(ldc:int(2115), ldc:int(2119)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(512), ldc:int(566)), xor:int(ldc:int(28688), ldc:int(28765))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(682), ldc:int(16457)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(814), ldc:int(867)), and:int(ldc:int(4718), ldc:int(9320))))
        storeelement:String(expr_13C:String[], xor:int(ldc:int(19200), ldc:int(19212)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(104), ldc:int(2408)), xor:int(ldc:int(198), ldc:int(113))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(4345), ldc:int(1547)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(18497), ldc:int(18678)), xor:int(ldc:int(6160), ldc:int(6362))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(24651), ldc:int(15)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, xor:int(ldc:int(3233), ldc:int(3179)), xor:int(ldc:int(8783), ldc:int(8877))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(25182), ldc:int(7207)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(1258), ldc:int(998)), and:int(ldc:int(12538), ldc:int(250))))
        storeelement:String(expr_13C:String[], and:int(ldc:int(-8967), ldc:int(8966)), invokevirtual:String[expected:String](String::substring, var_3_12A:String, and:int(ldc:int(251), ldc:int(3322)), and:int(ldc:int(413), ldc:int(12569))))
        putstatic:String[](\u7c6b\u9937\u1187\u624e\u3dd3::\uc229\u6b5f\u839e\u36d3\ud523\u56bd, expr_13C:String[])
        putstatic:Logger(\u7c6b\u9937\u1187\u624e\u3dd3::\u0b8e\u3776\ua562\u71ae\ud158\ubb2b, invokestatic:Logger(LogManager::getLogger))
        putstatic:Map<Class<? extends \u7d52\u718f\u3776\u6fb0\ub83f>, Integer>(\u7c6b\u9937\u1187\u624e\u3dd3::\uae5d\u9af2\u9937\uc229\u9af2\u51fa, invokestatic:HashMap[expected:Map<Class<? extends \u7d52\u718f\u3776\u6fb0\ub83f>, Integer>](Maps::newHashMap))
    }
    
    public void \u9a18\uc4d2\ufe34\ud7e8\u6bb9\u7c6b(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_634 : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_BE : double
        var_3_D0 : int
        var_11_E1 : int
        var_14_10B : double
        var_16_10F : int
        var_12_107 : double
        var_17_63F : int
        
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
        var_3_634 = and:int(ldc:int(74274676), ldc:int(-1899015171))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u7c6b\u9937\u1187\u624e\u3dd3[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(512)), ldc:int(0))) {
            var_3_634 = and:int(var_3_634:int, ldc:int(2003721214))
            var_5_80 = and:int(ldc:int(10947), ldc:int(-27332))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(-29625), ldc:int(29224)))
            invokestatic:int(m::a)
            
            loop {
                var_9_BE = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D0 = and:int(var_3_634:int, ldc:int(-1511358467))
                    var_9_BE = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_E1 = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_E1:int, sub:int(var_6_87:int, and:int(ldc:int(549), ldc:int(16579)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_E1:int, and:int(ldc:int(8771), ldc:int(1033)))), var_7_96:double))) {
                        inc:int(var_11_E1, ldc:int(1))
                    }
                    
                    var_3_634 = and:int(var_3_D0:int, ldc:int(2145318772))
                    var_14_10B = var_7_96:double
                    var_16_10F = var_11_E1:int
                }
                else {
                    var_11_E1 = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), and:int(ldc:int(4353), ldc:int(19151)))
                    var_12_107 = var_14_10B = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_10F = var_11_E1:int, var_6_87:int)) {
                        var_9_BE = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_E1:int)
                        var_16_10F = var_11_E1:int
                        var_14_10B = var_12_107:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1849614519))
                        goto(Label_1487)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-2100449301))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-387142533))
                        goto(Label_1084)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2126996602))
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0666)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1624431918))
                    }
                    else {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1747388420))
                        
                        if (cmplt:boolean(var_16_10F:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0558)
                            }
                            
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0404:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_1487)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1710637528))
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1084)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2071456170))
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        goto(Label_0666)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-245367453))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-2058561538))
                        var_11_E1 = and:int(ldc:int(-22363), ldc:int(4890))
                        goto(Label_1476)
                    }
                    
                    Label_0558:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1084)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(151650302))
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(490595902))
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1752340188))
                    }
                    else {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1669791873))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_10B = var_9_BE:double
                            goto(Label_0814)
                        }
                    }
                    
                    Label_0666:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1204351779))
                        goto(Label_1487)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(700084199))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1426836225))
                        goto(Label_1084)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(2088466332))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-157614849))
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-834247372))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1090846721))
                        var_14_10B = mul:double(ldc:double(0.5), add:double(var_9_BE:double, var_14_10B:double))
                    }
                    
                    Label_0814:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1932374448))
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(2)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1956505080))
                        goto(Label_1084)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1925535263))
                            goto(Label_0666)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1054735618))
                            goto(Label_0558)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(845883509))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1241720961))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_E1 = xor:int(ldc:int(1025), ldc:int(1024))
                                goto(Label_1084)
                            }
                        }
                    }
                    
                    Label_0939:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-401119493))
                        goto(Label_1316)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-334755995))
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            goto(Label_0666)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0558)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(434668650))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-161778819))
                        var_11_E1 = and:int(ldc:int(5145), ldc:int(-5146))
                    }
                    
                    Label_1084:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1863437359))
                        goto(Label_1487)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1929843393))
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0939)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(340070329))
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(32)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(-1817845979))
                            goto(Label_0666)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1404735034))
                            goto(Label_0558)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(510484478))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                                goto(Label_1316)
                            }
                        }
                    }
                    
                    Label_1214:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1487)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_1084)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                            goto(Label_0939)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0814)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(256)), ldc:int(0))) {
                            goto(Label_0666)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                            goto(Label_0558)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(524288)), ldc:int(0))) {
                            goto(Label_0404)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_634 = and:int(var_3_634:int, ldc:int(1027157688))
                            loopcontinue()
                        }
                        
                        var_3_634 = and:int(var_3_634:int, ldc:int(-1630840835))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_10B:double, var_5_80:int, var_16_10F:int)
                        goto(Label_1476)
                    }
                    
                    Label_1316:
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(905696582))
                        goto(Label_1487)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(16384)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(423084473))
                        goto(Label_1214)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1084)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-208210302))
                        goto(Label_0939)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(973788485))
                        goto(Label_0666)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-215730729))
                        goto(Label_0558)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4096)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(198658910))
                        goto(Label_0404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(1073741824)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(1671821721))
                        loopcontinue()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(1071568758))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_10B:double, ldc:double(0.0))
                    Label_1476:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_63F = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_E1:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1487:
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1316)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        goto(Label_1214)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(437681716))
                        goto(Label_1084)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-328012086))
                        goto(Label_0939)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0814)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0666)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0558)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(16777216)), ldc:int(0))) {
                        goto(Label_0404)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_634:int, ldc:int(64)), ldc:int(0))) {
                        var_3_634 = and:int(var_3_634:int, ldc:int(-553715721))
                        var_17_63F = add:int(var_16_10F:int, xor:int(ldc:int(272), ldc:int(273)))
                        looporswitchbreak()
                    }
                    
                    var_3_634 = and:int(var_3_634:int, ldc:int(-813722856))
                }
                
                var_3_634 = and:int(var_3_634:int, ldc:int(-9470980))
                
                if (cmple:boolean(var_5_80 = var_17_63F:int, sub:int(var_6_87:int, xor:int(ldc:int(-32731), ldc:int(-32732))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_634:int, ldc:int(8388608)), ldc:int(0))) {
            return:void()
        }
        
        goto(Label_0108)
    }
}
