public class \u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6fb0\u12cb\u5db4\uc7fe\u0800.\u61a4\ud217\u4e72\u6ec6\uc238\u72f1 {
    public void \u61a4\ud217\u4e72\u6ec6\uc238\u72f1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \u5d20\u7043\u88c5\u5db4\uf94d.\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3 p1) {
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
            invokespecial:\ub18d\uae87\u92ee\u624e\u7873\uc31c(\ub18d\uae87\u92ee\u624e\u7873\uc31c::<init>, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1)
            putfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe>(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u4ab3\u3bc9\u3776\ubff1\uae87\u8d90, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1, invokestatic:HashMap[expected:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe>](Maps::newHashMap))
            putfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1, initobject:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::<init>, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1, p1:\u4daf\u8df4\ubb2b\u759a\u7330\u4ab3, p0:\u6c52\u52d3\u516c\uae87\uae5d))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1 \u88c5\u1833\uc87f\u6d69\u69d9\u3e75(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p1) {
        var_3_79 : int
        var_5_6C : \u3e2a\uf9c5\ud217\u527a\u5654\u7ce1
        var_3_93 : int
        var_6_9F : Iterator<String>
        var_3_AC : int
        var_7_DD : String
        var_8_11E : Iterator<\ufe34\u960f\ua6bd\u71f1\u516c>
        var_9_154 : \ufe34\u960f\ua6bd\u71f1\u516c
        var_10_18A : InputStream
        var_11_192 : Throwable
        var_12_1A0 : InputStreamReader
        var_13_1A3 : Throwable
        var_14_1C4 : Map<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>
        var_15_1E3 : Iterator<Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>>
        var_16_1F9 : Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>
        var_14_25D : Throwable
        var_18_282 : Throwable
        var_12_2D0 : Throwable
        var_20_2F5 : Throwable
        var_10_318 : RuntimeException
        
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
            var_3_79 = and:int(and:int(ldc:int(-1629499051), ldc:int(-1881903633)), ldc:int(-873112717))
            var_5_6C = initobject:\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1(\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1::<init>)
            
            loop {
                if (cmpne:boolean(and:int(var_3_79:int, ldc:int(1)), ldc:int(0))) {
                    var_3_79 = and:int(var_3_79:int, ldc:int(-270903965))
                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\ucef1\u8258\u446c\u760c\u1833\u36d3, p1:\ubf56\u64f2\u392e\u98a4\u120d)
                }
                
                if (cmpne:boolean(and:int(var_3_79:int, ldc:int(134217728)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_3_79 = and:int(var_3_79:int, ldc:int(-1914999999))
            }
            
            var_3_93 = and:int(var_3_79:int, ldc:int(-1359880325))
            var_6_9F = invokeinterface:Iterator<String>(Set<String>::iterator, invokeinterface:Set<String>(\u6c52\u52d3\u516c\uae87\uae5d::\ubff1\u9af2\u3dd3\u8aa5\u3d64\ua6bd, p0:\u6c52\u52d3\u516c\uae87\uae5d))
            
            loop {
                if (cmpne:boolean(and:int(var_3_93:int, ldc:int(128)), ldc:int(0))) {
                    var_3_AC = and:int(var_3_93:int, ldc:int(465701768))
                }
                else {
                    var_3_AC = and:int(var_3_93:int, ldc:int(-338499469))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_9F:Iterator<String>))) {
                        looporswitchbreak()
                    }
                }
                
                if (cmpeq:boolean(and:int(var_3_AC:int, ldc:int(64)), ldc:int(0))) {
                    var_3_93 = and:int(var_3_AC:int, ldc:int(-1927887568))
                }
                else {
                    var_3_93 = and:int(var_3_AC:int, ldc:int(-1141517713))
                    var_7_DD = checkcast:String(java.lang.String.class, invokeinterface:String(Iterator<String>::next, var_6_9F:Iterator<String>))
                    
                    loop {
                        if (cmpne:boolean(and:int(var_3_93:int, ldc:int(134217728)), ldc:int(0))) {
                            var_3_93 = and:int(var_3_93:int, ldc:int(-17737605))
                            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, p1:\ubf56\u64f2\u392e\u98a4\u120d, var_7_DD:String)
                        }
                        
                        try {
                            if (cmpne:boolean(and:int(var_3_93:int, ldc:int(8)), ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            var_3_93 = and:int(var_3_93:int, ldc:int(-336202767))
                            var_8_11E = invokeinterface:Iterator<\ufe34\u960f\ua6bd\u71f1\u516c>(List<\ufe34\u960f\ua6bd\u71f1\u516c>::iterator, invokeinterface:List<\ufe34\u960f\ua6bd\u71f1\u516c>(\u6c52\u52d3\u516c\uae87\uae5d::\u36d3\u16f6\u47c2\uc2e8\u8cae\u5654, p0:\u6c52\u52d3\u516c\uae87\uae5d, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, var_7_DD:String, loadelement:String(getstatic:String[](\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc87f\ub70c\uf94d\u3504\u99f7\ub19c), and:int(ldc:int(3208), ldc:int(-3209))))))
                            
                            loop {
                                if (cmpne:boolean(and:int(var_3_93:int, ldc:int(1024)), ldc:int(0))) {
                                    var_3_93 = and:int(var_3_93:int, ldc:int(-1546439845))
                                }
                                else {
                                    var_3_93 = and:int(var_3_93:int, ldc:int(-2853931))
                                    
                                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_8_11E:Iterator<\ufe34\u960f\ua6bd\u71f1\u516c>))) {
                                        looporswitchbreak()
                                    }
                                }
                                
                                if (cmpne:boolean(and:int(var_3_93:int, ldc:int(33554432)), ldc:int(0))) {
                                    var_3_93 = and:int(var_3_93:int, ldc:int(-1628080691))
                                    var_9_154 = checkcast:\ufe34\u960f\ua6bd\u71f1\u516c(\ua562\ucb79\uc87f\u3dd3\ubcb0.\ufe34\u960f\ua6bd\u71f1\u516c.class, invokeinterface:\ufe34\u960f\ua6bd\u71f1\u516c(Iterator<\ufe34\u960f\ua6bd\u71f1\u516c>::next, var_8_11E:Iterator<\ufe34\u960f\ua6bd\u71f1\u516c>))
                                    
                                    loop {
                                        if (cmpne:boolean(and:int(var_3_93:int, ldc:int(1048576)), ldc:int(0))) {
                                            var_3_93 = and:int(var_3_93:int, ldc:int(-606079647))
                                            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, p1:\ubf56\u64f2\u392e\u98a4\u120d, invokeinterface:String(\ufe34\u960f\ua6bd\u71f1\u516c::\ufcaf\ua61f\uf995\u183a\ud523\uc3e3, var_9_154:\ufe34\u960f\ua6bd\u71f1\u516c))
                                        }
                                        
                                        try {
                                            if (cmpeq:boolean(and:int(var_3_93:int, ldc:int(4194304)), ldc:int(0))) {
                                                var_3_93 = and:int(var_3_93:int, ldc:int(1983947489))
                                                loopcontinue()
                                            }
                                            
                                            var_3_93 = and:int(var_3_93:int, ldc:int(-807937691))
                                            var_10_18A = invokeinterface:InputStream(\ufe34\u960f\ua6bd\u71f1\u516c::\u494c\u9af2\u3a62\u67d0\uff55\uc9f6, var_9_154:\ufe34\u960f\ua6bd\u71f1\u516c)
                                            var_3_93 = and:int(var_3_93:int, ldc:int(-1160516637))
                                            var_11_192 = aconstnull:Throwable()
                                            
                                            try {
                                                var_12_1A0 = initobject:InputStreamReader(InputStreamReader::<init>, var_10_18A:InputStream, getstatic:Charset(StandardCharsets::UTF_8))
                                                var_13_1A3 = aconstnull:Throwable()
                                                
                                                try {
                                                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u4179\u97b7\u3d64\ufcaf\u6ec6\u8c8a, p1:\ubf56\u64f2\u392e\u98a4\u120d, loadelement:String(getstatic:String[](\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc87f\ub70c\uf94d\u3504\u99f7\ub19c), xor:int(ldc:int(-28639), ldc:int(-28640))))
                                                    var_14_1C4 = checkcast:Map<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>(java.util.Map<java.lang.String, \u5245\u8aa5\u61a4\u7049\u4cd9.\u4bc8\u76bc\u7006\u759a\u8df4\u3e75>.class, invokestatic:Map<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>(\u3504\u67d0\u6c56\u2dcc\u8640\u760c::\ua3b4\u93a2\ub102\u6c52\ud36e\u7330, getstatic:Gson(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u156b\u4ab3\ub6ab\uceb8\u527a\u3d4b), var_12_1A0:InputStreamReader[expected:Reader], getstatic:TypeToken<Map<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>>(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u97e6\u7006\u7043\u7af6\ub83f\ubcb0)))
                                                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u3d4b\u64f2\u7d52\u3d4b\ua3b4\u385b, p1:\ubf56\u64f2\u392e\u98a4\u120d, loadelement:String(getstatic:String[](\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc87f\ub70c\uf94d\u3504\u99f7\ub19c), and:int(ldc:int(9219), ldc:int(622))))
                                                    var_15_1E3 = invokeinterface:Iterator<Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>>(Set<Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>>::iterator, invokeinterface:Set<Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>>(Map<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>::entrySet, var_14_1C4:Map<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>))
                                                    
                                                    while (invokeinterface:boolean(Iterator<E>::hasNext, var_15_1E3:Iterator<Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>>)) {
                                                        var_16_1F9 = checkcast:Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>(java.util.Map.Entry<java.lang.String, \u5245\u8aa5\u61a4\u7049\u4cd9.\u4bc8\u76bc\u7006\u759a\u8df4\u3e75>.class, invokeinterface:Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>(Iterator<Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>>::next, var_15_1E3:Iterator<Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>>))
                                                        invokestatic:void(\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1::\u6b0d\u156b\uc910\u8258\u5db4\ubded, var_5_6C:\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1, initobject:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u4179\ubb2b\uc7fe\u51fa\uc910\u8753::<init>, var_7_DD:String, checkcast:String(java.lang.String.class, invokeinterface:String(Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>::getKey, var_16_1F9:Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>))), checkcast:\u4bc8\u76bc\u7006\u759a\u8df4\u3e75(\u5245\u8aa5\u61a4\u7049\u4cd9.\u4bc8\u76bc\u7006\u759a\u8df4\u3e75.class, invokeinterface:\u4bc8\u76bc\u7006\u759a\u8df4\u3e75(Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>::getValue, var_16_1F9:Entry<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>)), p0:\u6c52\u52d3\u516c\uae87\uae5d)
                                                    }
                                                    
                                                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, p1:\ubf56\u64f2\u392e\u98a4\u120d)
                                                }
                                                catch (java.lang.Throwable var_14_25D) {
                                                    var_13_1A3 = var_14_25D:Throwable
                                                    athrow(var_14_25D:Throwable)
                                                }
                                                finally {
                                                    if (cmpne:boolean(var_12_1A0:InputStreamReader, aconstnull:InputStreamReader())) {
                                                        if (cmpne:boolean(var_13_1A3:Throwable, aconstnull:Throwable())) {
                                                            try {
                                                                invokevirtual:void(Reader::close, var_12_1A0:InputStreamReader)
                                                            }
                                                            catch (java.lang.Throwable var_18_282) {
                                                                invokevirtual:void(Throwable::addSuppressed, var_13_1A3:Throwable, var_18_282:Throwable)
                                                            }
                                                        }
                                                        else {
                                                            invokevirtual:void(Reader::close, var_12_1A0:InputStreamReader)
                                                        }
                                                    }
                                                }
                                            }
                                            catch (java.lang.Throwable var_12_2D0) {
                                                var_11_192 = var_12_2D0:Throwable
                                                athrow(var_12_2D0:Throwable)
                                            }
                                            finally {
                                                if (cmpne:boolean(var_10_18A:InputStream, aconstnull:InputStream())) {
                                                    if (cmpne:boolean(var_11_192:Throwable, aconstnull:Throwable())) {
                                                        try {
                                                            invokevirtual:void(InputStream::close, var_10_18A:InputStream)
                                                        }
                                                        catch (java.lang.Throwable var_20_2F5) {
                                                            invokevirtual:void(Throwable::addSuppressed, var_11_192:Throwable, var_20_2F5:Throwable)
                                                        }
                                                    }
                                                    else {
                                                        invokevirtual:void(InputStream::close, var_10_18A:InputStream)
                                                    }
                                                }
                                            }
                                        }
                                        catch (java.lang.RuntimeException var_10_318) {
                                            var_3_93 = and:int(var_3_93:int, ldc:int(-353177233))
                                            invokeinterface:void(Logger::warn, getstatic:Logger(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u5db4\u76bc\u3e2a\u946b\u4492\u8308), loadelement:String(getstatic:String[](\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc87f\ub70c\uf94d\u3504\u99f7\ub19c), and:int(ldc:int(16683), ldc:int(663))), invokeinterface:String(\ufe34\u960f\ua6bd\u71f1\u516c::\ufcaf\ua61f\uf995\u183a\ud523\uc3e3, var_9_154:\ufe34\u960f\ua6bd\u71f1\u516c), var_10_318:RuntimeException[expected:Object])
                                        }
                                        
                                        looporswitchbreak()
                                    }
                                    
                                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, p1:\ubf56\u64f2\u392e\u98a4\u120d)
                                }
                            }
                        }
                        catch (java.io.IOException stack_34F_0) {
                        }
                        
                        looporswitchbreak()
                    }
                    
                    invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u61a4\u4c04\uf995\uc31c\u4ab3\u6d69, p1:\ubf56\u64f2\u392e\u98a4\u120d)
                }
            }
            
            invokeinterface:void(\ubf56\u64f2\u392e\u98a4\u120d::\u8aa5\ufcaf\u64f2\ua562\ubefe\u69d9, p1:\ubf56\u64f2\u392e\u98a4\u120d)
            return:\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1(var_5_6C:\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1)
        }
        
        goto(Label_0006)
    }
    
    public void \u88c5\u4c2b\u2dcc\ucfaf\u927d\u7006(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p2) {
        var_4_61 : int
        var_6_7D : Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>
        var_7_142 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        var_8_152 : \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe
        var_9_179 : String
        var_7_1F6 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        
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
            var_4_61 = and:int(ldc:int(57069667), ldc:int(-127993265))
            invokevirtual:void(\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1::\u51b2\ub113\uc31c\u8d98\u516c\uae87, p0:\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe>(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u4ab3\u3bc9\u3776\ubff1\uae87\u8d90, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1))
            var_6_7D = invokeinterface:Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::iterator, invokeinterface:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe>::keySet, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe>(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u4ab3\u3bc9\u3776\ubff1\uae87\u8d90, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1)))
            
            loop {
                Label_0127:
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(8388608)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(769932583))
                }
                else {
                    if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1048576)), ldc:int(0))) {
                        var_4_61 = and:int(var_4_61:int, ldc:int(-1532110185))
                        goto(Label_0244)
                    }
                    
                    if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(131072)), ldc:int(0))) {
                        var_4_61 = and:int(var_4_61:int, ldc:int(-120551670))
                        goto(Label_0199)
                    }
                    
                    var_4_61 = and:int(var_4_61:int, ldc:int(-1764822045))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator::hasNext, var_6_7D:Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>))) {
                        goto(Label_0199)
                    }
                    
                    var_7_142 = checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::next, var_6_7D:Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>))
                    var_8_152 = checkcast:\u6c56\u5f50\u36d3\uc910\u7ce1\ubefe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6c56\u5f50\u36d3\uc910\u7ce1\ubefe.class, invokeinterface:\u6c56\u5f50\u36d3\uc910\u7ce1\ubefe(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe>::get, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe>(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u4ab3\u3bc9\u3776\ubff1\uae87\u8d90, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), var_7_142:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object]))
                    
                    if (instanceof:boolean(net.minecraft.util.text.TranslationTextComponent.class, invokevirtual:ITextComponent(\u6c56\u5f50\u36d3\uc910\u7ce1\ubefe::\u71f1\u3bc9\ub18d\u5d20\ub32d\u67e9, var_8_152:\u6c56\u5f50\u36d3\uc910\u7ce1\ubefe))) {
                        var_9_179 = invokevirtual:String(TranslationTextComponent::getKey, checkcast:TranslationTextComponent(net.minecraft.util.text.TranslationTextComponent.class, invokevirtual:ITextComponent[expected:TranslationTextComponent](\u6c56\u5f50\u36d3\uc910\u7ce1\ubefe::\u71f1\u3bc9\ub18d\u5d20\ub32d\u67e9, var_8_152:\u6c56\u5f50\u36d3\uc910\u7ce1\ubefe)))
                        
                        if (logicalnot:boolean(invokestatic:boolean(\u6fb0\u99f7\u7330\u624e\u97e6\u760c::\u600f\uc229\uc9f6\u5bc4\u4975\ua3b4, var_9_179:String))) {
                            invokeinterface:void(Logger::debug, getstatic:Logger(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u5db4\u76bc\u3e2a\u946b\u4492\u8308), loadelement:String(getstatic:String[](\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc87f\ub70c\uf94d\u3504\u99f7\ub19c), xor:int(ldc:int(21508), ldc:int(21504))), var_9_179:String[expected:Object], var_7_142:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
                        }
                    }
                    
                    var_4_61 = and:int(var_4_61:int, ldc:int(-741360947))
                    loopcontinue()
                }
                
                Label_0440:
                
                while (cmpeq:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                    if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_0199)
                    }
                    
                    if (cmpne:boolean(and:int(var_4_61:int, ldc:int(524288)), ldc:int(0))) {
                        loopcontinue(Label_0127)
                    }
                    
                    var_4_61 = and:int(var_4_61:int, ldc:int(408944111))
                    
                    if (logicalnot:boolean(invokeinterface:boolean(Iterator<E>::hasNext, var_6_7D:Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>))) {
                        looporswitchbreak()
                    }
                    
                    var_7_1F6 = checkcast:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753.class, invokeinterface:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::next, var_6_7D:Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>))
                    
                    if (logicalnot:boolean(invokevirtual:boolean(\ud12e\ub8be\u69d9\uc246\uc84e\u9255<T>::\u1187\u97b7\u839e\ub8be\u40a9\u7330, getstatic:\ud12e\ub8be\u69d9\uc246\uc84e\u9255<\u6b0d\u3d64\u446c\u6cfe\u5f50\u9937>(\ud12e\ub8be\u69d9\uc246\uc84e\u9255::\uc29a\u4bc8\u69d9\uc7fe\u3504\u718f), var_7_1F6:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753))) {
                        invokeinterface:void(Logger::debug, getstatic:Logger(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u5db4\u76bc\u3e2a\u946b\u4492\u8308), loadelement:String(getstatic:String[](\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc87f\ub70c\uf94d\u3504\u99f7\ub19c), and:int(ldc:int(22727), ldc:int(8205))), var_7_1F6:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
                    }
                    
                    var_4_61 = and:int(var_4_61:int, ldc:int(-958416393))
                }
                
                goto(Label_0244)
                Label_0199:
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(4096)), ldc:int(0))) {
                    goto(Label_0440)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(512)), ldc:int(0))) {
                    if (cmpne:boolean(and:int(var_4_61:int, ldc:int(1048576)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_4_61 = and:int(var_4_61:int, ldc:int(-1287193735))
                    
                    if (invokeinterface:boolean(Logger::isDebugEnabled, getstatic:Logger(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u5db4\u76bc\u3e2a\u946b\u4492\u8308))) {
                        var_6_7D = invokeinterface:Iterator<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>::iterator, invokeinterface:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe>::keySet, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe>(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u4ab3\u3bc9\u3776\ubff1\uae87\u8d90, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1)))
                        goto(Label_0440)
                    }
                }
                
                Label_0244:
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(268435456)), ldc:int(0))) {
                    var_4_61 = and:int(var_4_61:int, ldc:int(2019549619))
                    goto(Label_0440)
                }
                
                if (cmpne:boolean(and:int(var_4_61:int, ldc:int(8)), ldc:int(0))) {
                    goto(Label_0199)
                }
                
                if (cmpeq:boolean(and:int(var_4_61:int, ldc:int(4)), ldc:int(0))) {
                    looporswitchbreak()
                }
                
                var_4_61 = and:int(var_4_61:int, ldc:int(1825112826))
            }
            
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\u88c5\u36d3\u59ec\u6d69\ud7e8\ua562, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    private static boolean \u7bad\u7049\u156b\u873d\u99f7\u8d90(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ud171\u93a2\u8640\u4492\u9a18\u8c8a p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p2) {
        var_5_66 : \u4179\ubb2b\uc7fe\u51fa\uc910\u8753
        
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
        var_5_66 = invokevirtual:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753(\ud171\u93a2\u8640\u4492\u9a18\u8c8a::\u64ab\u71ae\ua068\u59ec\u446c\u64f2, p0:\ud171\u93a2\u8640\u4492\u9a18\u8c8a)
        
        if (invokeinterface:boolean(\u6c52\u52d3\u516c\uae87\uae5d::\u3a62\u47c2\ua3b4\ub83f\ud523\u7049, p2:\u6c52\u52d3\u516c\uae87\uae5d, var_5_66:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753)) {
            return:boolean(and:int[expected:boolean](ldc:int(25857), ldc:int(83)))
        }
        
        invokeinterface:void(Logger::warn, getstatic:Logger(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u5db4\u76bc\u3e2a\u946b\u4492\u8308), loadelement:String(getstatic:String[](\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc87f\ub70c\uf94d\u3504\u99f7\ub19c), and:int(ldc:int(10471), ldc:int(270))), var_5_66:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object], p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])
        return:boolean(and:int[expected:boolean](ldc:int(20239), ldc:int(-20240)))
    }
    
    public \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6c56\u5f50\u36d3\uc910\u7ce1\ubefe \uc910\u64ab\u71f1\u6d69\ud12e\ubf56(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0) {
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
            return:\u6c56\u5f50\u36d3\uc910\u7ce1\ubefe(checkcast:\u6c56\u5f50\u36d3\uc910\u7ce1\ubefe(\u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6c56\u5f50\u36d3\uc910\u7ce1\ubefe.class, invokeinterface:\u6c56\u5f50\u36d3\uc910\u7ce1\ubefe(Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe>::get, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe>(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u4ab3\u3bc9\u3776\ubff1\uae87\u8d90, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753[expected:Object])))
        }
        
        goto(Label_0006)
    }
    
    public java.util.Collection<\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753> \u7bad\ub70c\ub171\u47c2\u6435\u61a4() {
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
            return:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>(invokeinterface:Set<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>[expected:Collection<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753>](Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe>::keySet, getfield:Map<\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, \u6c56\u5f50\u36d3\uc910\u7ce1\ubefe>(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u4ab3\u3bc9\u3776\ubff1\uae87\u8d90, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1)))
        }
        
        goto(Label_0006)
    }
    
    public void \u64f2\ua562\u6cfe\u7af6\ud217\u3d4b(\u4492\u8aa5\ud171\uc3e3\u4c2b.\u4c04\ua068\u3d64\ua6bd\u8389.\u960f\ubefe\ud4fe\u7c6b\u5db4.\u6b5f\u6198\u8389\u3c25\u839e\u51fa p0) {
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
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\u12cb\u40a9\u647c\ub70c\ub171\u62da, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), p0:\u6b5f\u6198\u8389\u3c25\u839e\u51fa)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ubf56\ua61f\u4975\ua61f\u1187\u6b5f(\u12b2\u7049\u8df4\uc9f6\uae87.\u9033\u6b0d\u3d64\uae87\u4c04\u965f p0) {
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
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\uceb8\ua562\u6198\uae5d\u6fb0\u6bb9, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), p0:\u9033\u6b0d\u3d64\uae87\u4c04\u965f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u3bc9\u4d85\u8d98\u7af6\u7043\u5654(\u12b2\u7049\u8df4\uc9f6\uae87.\u9033\u6b0d\u3d64\uae87\u4c04\u965f p0, int p1) {
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
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\u6198\u93a2\u4975\ub6ab\u7bad\u8308, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), p0:\u9033\u6b0d\u3d64\uae87\u4c04\u965f, p1:int)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \ufcaf\u62da\u873d\ua068\u760c\u0c95(\u3504\ufe34\u600f\u6b0d\u69d9.\u836c\u8cae\ub18d\u836c\u8753\u59ec p0) {
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
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\u6bb9\u67e9\u6cfe\ub113\u67d0\u8d98, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), p0:\u836c\u8cae\ub18d\u836c\u8753\u59ec)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u51b2\u3e2a\u759a\u839e\u59ec\ud12e() {
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
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\u3d4b\uf9c5\u7ce1\ubefe\uae87\u69d9, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7af6\u6cfe\u416d\u3e75\u9033\uc910() {
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
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\ub7dc\u4c04\u8753\u7d52\u88c5\u7af6, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u8258\u76bc\u6b0d\u51b2\u5140\ufe34() {
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
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\u97e6\u4cd9\uc29a\u0a06\u873d\ub8be, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u6cfe\uf995\uc246\u8413\ub102\u8709(boolean p0) {
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
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\u760c\uc238\u3711\u7bad\u8bb0\u946b, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), p0:boolean)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u67e9\u183a\u120d\u385b\uc246\ua3b4() {
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
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\uc4d2\u3711\ub171\u12b2\u5d20\u8640, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u718f\u61a4\u4c2b\u72f1\u61a4\ub83f(\u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8 p0, float p1) {
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
            
            if (cmpeq:boolean(p0:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8, getstatic:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8(\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8::\u7330\uc87f\uf9c5\u69d9\u9af2\u836c))) {
                if (cmple:boolean(p1:float, ldc:float(0.0f))) {
                    invokevirtual:void(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u7af6\u6cfe\u416d\u3e75\u9033\uc910, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1)
                }
            }
            
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\u6d99\u3d64\u7af6\uae87\uc2bd\u946b, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), p0:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8, p1:float)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7af6\u6cfe\u416d\u3e75\u9033\uc910(\u12b2\u7049\u8df4\uc9f6\uae87.\u9033\u6b0d\u3d64\uae87\u4c04\u965f p0) {
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
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\u960f\u8c8a\ubf56\u0800\ub102\u3dd3, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), p0:\u9033\u6b0d\u3d64\uae87\u4c04\u965f)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public boolean \u88c5\u3d64\uae87\u624e\ub1b9\u071d(\u12b2\u7049\u8df4\uc9f6\uae87.\u9033\u6b0d\u3d64\uae87\u4c04\u965f p0) {
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
            return:boolean(invokevirtual:boolean(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\u647c\u8350\u836c\ud523\ub1b9\u8aa5, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), p0:\u9033\u6b0d\u3d64\uae87\u4c04\u965f))
        }
        
        goto(Label_0006)
    }
    
    public void \u0b8e\u6cfe\ud51e\uc910\u99f7\uc84e(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u59ec\u4bc8\u9033\u494c\u8308\ud51e p0) {
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
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\ub6ab\u12b2\u7873\u97b7\u64ab\u927d, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), p0:\u59ec\u4bc8\u9033\u494c\u8308\ud51e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u99f7\uc9f6\u416d\u7873\u8753\u6cfe(\ubcb0\ud12e\u51fa\u8aa5\u0c95.\u59ec\u4bc8\u9033\u494c\u8308\ud51e p0) {
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
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\u5bc4\u7ce1\uf9c5\u760c\u97e6\uc229, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), p0:\u59ec\u4bc8\u9033\u494c\u8308\ud51e)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u7af6\u6cfe\u416d\u3e75\u9033\uc910(\u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p0, \u36d3\u9033\u6b0d\u983f\u8d90.\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8 p1) {
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
            invokevirtual:void(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\u960f\u8c8a\ubf56\u0800\ub102\u3dd3, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1), p0:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p1:\u88c5\ub83f\uc246\u8c8a\u960f\ud7e8)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.String \ua3b4\u839e\u7330\u92ff\uc2e8\u6d99() {
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
            return:String(invokevirtual:String(\u9af2\u8413\u156b\u76bc\u4cd9\ub32d::\u88c5\u59ec\uc2e8\u7e3f\u156b\u4daf, getfield:\u9af2\u8413\u156b\u76bc\u4cd9\ub32d(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc7fe\u3bd6\u4ab3\u64f2\u92ff\u4ab3, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1)))
        }
        
        goto(Label_0006)
    }
    
    public void \u88c5\u4c2b\u2dcc\ucfaf\u927d\u7006(java.lang.Object p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p1, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p2) {
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
            invokevirtual:void(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u88c5\u4c2b\u2dcc\ucfaf\u927d\u7006, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1, checkcast:\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u7c6b\ubded\u0b8e\u2dcc\u8c8a.\ud12e\u16f6\u8d98\u4c04\u16f6.\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1.class, p0:Object[expected:\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1]), p1:\u6c52\u52d3\u516c\uae87\uae5d, p2:\ubf56\u64f2\u392e\u98a4\u120d)
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public java.lang.Object \u88c5\u1833\uc87f\u6d69\u69d9\u3e75(\u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p0, \ubcb0\ud12e\u51fa\u8aa5\u0c95.\ubf56\u64f2\u392e\u98a4\u120d p1) {
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
            return:Object(invokevirtual:\u3e2a\uf9c5\ud217\u527a\u5654\u7ce1[expected:Object](\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u88c5\u1833\uc87f\u6d69\u69d9\u3e75, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1, p0:\u6c52\u52d3\u516c\uae87\uae5d, p1:\ubf56\u64f2\u392e\u98a4\u120d))
        }
        
        goto(Label_0006)
    }
    
    public static org.apache.logging.log4j.Logger \u4492\uf94d\u7af6\u6fb0\u97e6\u3a62() {
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
            return:Logger(getstatic:Logger(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u5db4\u76bc\u3e2a\u946b\u4492\u8308))
        }
        
        goto(Label_0006)
    }
    
    public static boolean \u839e\u4975\ub1b9\u3bd6\u8258\u183a(\u392e\ud7e8\u3bc9\u88c5\ud51e.\ud171\u93a2\u8640\u4492\u9a18\u8c8a p0, \u3bc9\u67e9\uc87f\u47c2\u5f50.\u4179\ubb2b\uc7fe\u51fa\uc910\u8753 p1, \u7c6b\u7c6b\ubefe\u385b\u3c25.\ud7e8\u0800\uae87\u8d90\u183a.\u34df\u12b2\u16f6\u873d\u7af6.\u6c52\u52d3\u516c\uae87\uae5d p2) {
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
            return:boolean(invokestatic:boolean(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u7bad\u7049\u156b\u873d\u99f7\u8d90, p0:\ud171\u93a2\u8640\u4492\u9a18\u8c8a, p1:\u4179\ubb2b\uc7fe\u51fa\uc910\u8753, p2:\u6c52\u52d3\u516c\uae87\uae5d))
        }
        
        goto(Label_0006)
    }
    
    static {
        var_0_61 : int
        expr_68 : byte[] [generated]
        var_2_6C : byte[]
        stack_9C_0 : byte[] [generated]
        stack_9E_0 : byte[] [generated]
        stack_CB_0 : byte[] [generated]
        stack_CD_0 : byte[] [generated]
        stack_FA_0 : byte[] [generated]
        stack_FC_0 : byte[] [generated]
        stack_131_0 : byte[] [generated]
        stack_30C_0 : byte[] [generated]
        stack_352_0 : byte[] [generated]
        stack_3D7_0 : byte[] [generated]
        expr_70 : int [generated]
        var_3_29D : byte[]
        var_4_29E : int
        expr_9E : int [generated]
        var_5_2EE : int
        var_3_2F3 : byte[]
        var_4_2F4 : int
        var_0_36B : int
        expr_352 : byte [generated]
        stack_3A2_2 : byte [generated]
        stack_377_0 : byte [generated]
        expr_CD : int [generated]
        expr_FC : int [generated]
        var_3_3C5 : byte[]
        var_4_3C6 : int
        expr_3DA : byte [generated]
        var_3_13D : String
        expr_145 : String[] [generated]
        expr_14F : String[] [generated]
        
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
            var_0_61 = and:int(ldc:int(-558316688), ldc:int(-1086530563))
            expr_68 = var_2_6C = stack_9C_0 = stack_9E_0 = stack_CB_0 = stack_CD_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_30C_0 = stack_352_0 = stack_3D7_0 = invokevirtual(Decoder::decode, invokestatic(Base64::getDecoder), ldc("HY1dr7/R4+pdoVHX6CNLx9Jbt8VZfepcVdvLo0Pf6F1J37/Vtf/B7apR29VZsdKF8c+bxeXHU7XKNenb30vfwkfZc9/f0a3GOf+9x9/729vV8TlXQlo/xDf4K3/V5+1Ju6RBx+Ov99d9r7/V4+QzS8fKUdvJI03GXIftwxHZ7CHZwe1Jr8o16dVtw6pR29VP1eQnIVHGWlPtx8kx79JLv9Xn6+mvy5Xp1cXbpcffw+PN+7m33d3TxdXp299L38JHx8+xoA=="))
            expr_70 = add:int(arraylength:int(expr_68:byte[]), ldc:int(-1))
            
            if (cmpne:boolean(expr_70:int, ldc:int(0))) {
                var_3_29D = newarray:byte[](byte.class, expr_70:int)
                var_4_29E = expr_70:int
                
                loop {
                    var_0_61 = and:int(var_0_61:int, ldc:int(761490419))
                    var_4_29E = add:int(var_4_29E:int, ldc:int(-1))
                    storeelement:byte(var_3_29D:byte[], var_4_29E:int, add:int(shl:int(loadelement:byte(expr_68:byte[], var_4_29E:int), ldc:int(3)), and:int(shr:int(loadelement:byte(var_2_6C:byte[], add:int(var_4_29E:int, and:int(ldc:int(73), ldc:int(1041)))), ldc:int(5)), xor:int(ldc:int(394), ldc:int(397)))))
                    
                    if (cmpne:boolean(var_4_29E:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    looporswitchbreak()
                }
                
                stack_9E_0 = stack_9C_0 = stack_CB_0 = stack_CD_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_30C_0 = stack_352_0 = stack_3D7_0 = var_3_29D:byte[]
            }
            
            loop {
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(4194304)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-2141717670))
                    goto(Label_0257)
                }
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(64)), ldc:int(0))) {
                    goto(Label_0210)
                }
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2147483647)), ldc:int(0))) {
                    goto(Label_0163)
                }
                
                var_0_61 = and:int(var_0_61:int, ldc:int(1837075575))
                expr_9E = arraylength:int(stack_9E_0:byte[])
                
                if (cmpeq:boolean(expr_9E:int, ldc:int(0))) {
                    goto(Label_0163)
                }
                
                var_5_2EE = expr_9E:int
                var_3_2F3 = newarray:byte[](byte.class, expr_9E:int)
                var_4_2F4 = expr_9E:int
                Label_0758:
                
                while (cmpne:boolean(and:int(var_0_61:int, ldc:int(64)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(1319457904))
                    var_4_2F4 = add:int(var_4_2F4:int, ldc:int(-1))
                    storeelement:byte(var_3_2F3:byte[], var_4_2F4:int, add:byte(loadelement:byte(stack_30C_0:byte[], var_4_2F4:int), ldc:byte(2)))
                    
                    if (cmpne:boolean(var_4_2F4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_9E_0 = stack_9C_0 = stack_CB_0 = stack_CD_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_30C_0 = stack_352_0 = stack_3D7_0 = var_3_2F3:byte[]
                    goto(Label_0163)
                }
                
                Label_0827:
                
                while (cmpne:boolean(and:int(var_0_61:int, ldc:int(16)), ldc:int(0))) {
                    var_0_36B = and:int(var_0_61:int, ldc:int(-1634969220))
                    var_4_2F4 = add:int(var_4_2F4:int, ldc:int(-1))
                    expr_352 = stack_3A2_2 = loadelement(stack_352_0, var_4_2F4)
                    
                    if (cmplt:boolean(add:int(add:int(var_4_2F4:int, ldc:int(3)), neg:int(var_5_2EE:int)), ldc:int(0))) {
                        stack_3A2_2 = stack_377_0 = add:byte(expr_352:byte, loadelement:byte(var_3_2F3:byte[], add:int(var_4_2F4:int, ldc:int(3))))
                        goto(Label_0903)
                    }
                    
                    Label_0863:
                    
                    if (cmpne:boolean(and:int(var_0_36B:int, ldc:int(128)), ldc:int(0))) {
                        var_0_36B = and:int(var_0_36B:int, ldc:int(1661315768))
                    }
                    else {
                        var_0_36B = and:int(var_0_36B:int, ldc:int(-591599370))
                        stack_3A2_2 = stack_377_0 = add:byte(expr_352:byte, ldc:byte(3))
                    }
                    
                    Label_0903:
                    
                    if (cmpne:boolean(and:int(var_0_36B:int, ldc:int(4194304)), ldc:int(0))) {
                        var_0_36B = and:int(var_0_36B:int, ldc:int(-858764434))
                        goto(Label_0863)
                    }
                    
                    var_0_61 = and:int(var_0_36B:int, ldc:int(248991484))
                    storeelement:byte(var_3_2F3:byte[], var_4_2F4:int, stack_3A2_2:byte)
                    
                    if (cmpne:boolean(var_4_2F4:int, ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    stack_9E_0 = stack_9C_0 = stack_CB_0 = stack_CD_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_30C_0 = stack_352_0 = stack_3D7_0 = var_3_2F3:byte[]
                    goto(Label_0210)
                }
                
                goto(Label_0758)
                Label_0163:
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(128)), ldc:int(0))) {
                    goto(Label_0257)
                }
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(461876604))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(16)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_61 = and:int(var_0_61:int, ldc:int(-1636902030))
                    expr_CD = arraylength:int(stack_CD_0:byte[])
                    
                    if (cmpne:boolean(expr_CD:int, ldc:int(0))) {
                        var_5_2EE = expr_CD:int
                        var_3_2F3 = newarray:byte[](byte.class, expr_CD:int)
                        var_4_2F4 = expr_CD:int
                        goto(Label_0827)
                    }
                }
                
                Label_0210:
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(67108864)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-96374628))
                }
                else {
                    if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_0163)
                    }
                    
                    if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(2147483647)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_0_61 = and:int(var_0_61:int, ldc:int(1017170555))
                    expr_FC = arraylength:int(stack_FC_0:byte[])
                    
                    if (cmpne:boolean(expr_FC:int, ldc:int(0))) {
                        var_3_3C5 = newarray:byte[](byte.class, expr_FC:int)
                        var_4_3C6 = expr_FC:int
                        
                        loop {
                            var_0_61 = and:int(var_0_61:int, ldc:int(509831166))
                            var_4_3C6 = add:int(var_4_3C6:int, ldc:int(-1))
                            expr_3DA = xor:byte(loadelement:byte(stack_3D7_0:byte[], var_4_3C6:int), ldc:byte(116))
                            storeelement:byte(var_3_3C5:byte[], var_4_3C6:int, or:int(and:int(shl:int(expr_3DA:byte, xor:int(ldc:int(18441), ldc:int(18445))), ldc:int(-16)), and:int(shr:int(expr_3DA:byte[expected:int], and:int(ldc:int(1028), ldc:int(2573))), ldc:int(15))))
                            
                            if (cmpne:boolean(var_4_3C6:int, ldc:int(0))) {
                                loopcontinue()
                            }
                            
                            looporswitchbreak()
                        }
                        
                        stack_9E_0 = stack_9C_0 = stack_CB_0 = stack_CD_0 = stack_FA_0 = stack_FC_0 = stack_131_0 = stack_30C_0 = stack_352_0 = stack_3D7_0 = var_3_3C5:byte[]
                    }
                }
                
                Label_0257:
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(4096)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-645538869))
                    goto(Label_0210)
                }
                
                if (cmpne:boolean(and:int(var_0_61:int, ldc:int(65536)), ldc:int(0))) {
                    var_0_61 = and:int(var_0_61:int, ldc:int(-279666382))
                    goto(Label_0163)
                }
                
                if (cmpeq:boolean(and:int(var_0_61:int, ldc:int(131072)), ldc:int(0))) {
                    looporswitchbreak()
                }
            }
            
            var_3_13D = initobject:String(String::<init>, stack_131_0:byte[], getstatic:Charset(StandardCharsets::UTF_8))
            expr_145 = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(9259), ldc:int(9251)))
            expr_14F = newarray:String[](Ljava.lang.String.class, xor:int(ldc:int(1446), ldc:int(1454)))
            storeelement:String(expr_14F:String[], and:int(ldc:int(6182), ldc:int(7)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, and:int(ldc:int(-3704), ldc:int(2647)), and:int(ldc:int(49), ldc:int(17713))))
            storeelement:String(expr_14F:String[], xor:int(ldc:int(16721), ldc:int(16722)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, xor:int(ldc:int(-32670), ldc:int(-32685)), and:int(ldc:int(2138), ldc:int(22010))))
            storeelement:String(expr_14F:String[], and:int(ldc:int(16516), ldc:int(8774)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, xor:int(ldc:int(16393), ldc:int(16467)), and:int(ldc:int(24699), ldc:int(895))))
            storeelement:String(expr_14F:String[], xor:int(ldc:int(1093), ldc:int(1088)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, xor:int(ldc:int(10832), ldc:int(10795)), and:int(ldc:int(5529), ldc:int(2745))))
            storeelement:String(expr_145:String[], xor:int(ldc:int(1156), ldc:int(1155)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, xor:int(ldc:int(78), ldc:int(215)), and:int(ldc:int(4283), ldc:int(171))))
            storeelement:String(expr_14F:String[], and:int(ldc:int(521), ldc:int(8225)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, xor:int(ldc:int(-29513), ldc:int(-29668)), and:int(ldc:int(16567), ldc:int(10672))))
            storeelement:String(expr_14F:String[], xor:int(ldc:int(25093), ldc:int(25095)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, and:int(ldc:int(16562), ldc:int(3313)), and:int(ldc:int(20920), ldc:int(764))))
            storeelement:String(expr_14F:String[], and:int(ldc:int(19168), ldc:int(-19170)), invokevirtual:String[expected:String](String::substring, var_3_13D:String, xor:int(ldc:int(66), ldc:int(250)), xor:int(ldc:int(16552), ldc:int(16491))))
            putstatic:String[](\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\uc87f\ub70c\uf94d\u3504\u99f7\ub19c, expr_14F:String[])
            putstatic:\ud171\u93a2\u8640\u4492\u9a18\u8c8a(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u7049\u8350\ub8be\u965f\u6b0d\u6198, initobject:\ud171\u93a2\u8640\u4492\u9a18\u8c8a(\ud171\u93a2\u8640\u4492\u9a18\u8c8a::<init>, loadelement:String(expr_145:String[], and:int(ldc:int(1199), ldc:int(27399))), ldc:float(1.0f), ldc:float(1.0f), and:int(ldc:int(24763), ldc:int(773)), getstatic:\u12b2\u9af2\u4f52\ubff1\u7bad\ucef1(\u12b2\u9af2\u4f52\ubff1\u7bad\ucef1::\u1187\u12b2\u4bc8\u9255\u92ee\ud158), and:int[expected:boolean](ldc:int(-4268), ldc:int(4267)), and:int[expected:boolean](ldc:int(-26309), ldc:int(9924)), ldc:int(16)))
            putstatic:Logger(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u5db4\u76bc\u3e2a\u946b\u4492\u8308, invokestatic:Logger(LogManager::getLogger))
            putstatic:Gson(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u156b\u4ab3\ub6ab\uceb8\u527a\u3d4b, invokevirtual:Gson(GsonBuilder::create, invokevirtual:GsonBuilder(GsonBuilder::registerTypeAdapter, invokevirtual:GsonBuilder(GsonBuilder::registerTypeHierarchyAdapter, initobject:GsonBuilder(GsonBuilder::<init>), ldc:Class<ITextComponent>(net.minecraft.util.text.ITextComponent.class), initobject:ITextComponent$Serializer[expected:Object](ITextComponent$Serializer::<init>)), ldc:Class<\u4bc8\u76bc\u7006\u759a\u8df4\u3e75>[expected:Type](\u5245\u8aa5\u61a4\u7049\u4cd9.\u4bc8\u76bc\u7006\u759a\u8df4\u3e75.class), initobject:\u946b\u873d\ub1b9\u0b8e\u0b8e\u183a[expected:Object](\u946b\u873d\ub1b9\u0b8e\u0b8e\u183a::<init>))))
            putstatic:TypeToken<Map<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>>(\u61a4\ud217\u4e72\u6ec6\uc238\u72f1::\u97e6\u7006\u7043\u7af6\ub83f\ubcb0, initobject:\u6fb0\u8709\u759a\u47c2\ud12e\ub8be[expected:TypeToken<Map<String, \u4bc8\u76bc\u7006\u759a\u8df4\u3e75>>](\u6fb0\u8709\u759a\u47c2\ud12e\ub8be::<init>))
            return:void()
        }
        
        goto(Label_0006)
    }
    
    public void \u9a18\ua3b4\ud171\u4cd9\u3bd6\u7043(\u6ec6\ubb2b\uf94d\u6d99\u4f52.\uae87\u3bc9\u3bc9\u7049\uc246\u3e75 p0, \u7c6b\u7c6b\ubefe\u385b\u3c25.\u4ab3\ub83f\u718f\ucb79\u120d.\u6b5f\u5f50\ubefe\ucfaf\u4f52\ub18d p1) {
        var_3_64B : int
        var_5_80 : int
        var_6_87 : int
        var_7_96 : double
        var_9_C7 : double
        var_3_D9 : int
        var_11_EA : int
        var_14_114 : double
        var_16_118 : int
        var_12_110 : double
        var_17_656 : int
        
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
        var_3_64B = and:int(ldc:int(1493846318), ldc:int(-917852697))
        
        if (cmpeq:boolean(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.0))) {
            invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, this:\u61a4\ud217\u4e72\u6ec6\uc238\u72f1[expected:Object], p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75[expected:Object])
            goto(Label_0170)
        }
        
        Label_0108:
        
        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(33554432)), ldc:int(0))) {
            var_3_64B = and:int(var_3_64B:int, ldc:int(1478023743))
            var_5_80 = and:int(ldc:int(-32405), ldc:int(31380))
            var_6_87 = invokestatic:int(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u8389\u3bd6\u3bc9\uc2bd\u8640\u52d3)
            var_7_96 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), and:int(ldc:int(587), ldc:int(-8784)))
            invokestatic:int(m::a)
            
            loop {
                var_9_C7 = ldc:double(0.0)
                
                if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                    var_3_D9 = and:int(var_3_64B:int, ldc:int(-588423257))
                    var_9_C7 = sub:double(var_7_96:double, mul:double(getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d), ldc:double(0.001)))
                    var_11_EA = var_5_80:int
                    
                    while (logicaland:boolean(cmplt:boolean(var_11_EA:int, sub:int(var_6_87:int, xor:int(ldc:int(904), ldc:int(905)))), cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), add:int(var_11_EA:int, and:int(ldc:int(8489), ldc:int(4099)))), var_7_96:double))) {
                        inc:int(var_11_EA, ldc:int(1))
                    }
                    
                    var_3_64B = and:int(var_3_D9:int, ldc:int(1768040615))
                    var_14_114 = var_7_96:double
                    var_16_118 = var_11_EA:int
                }
                else {
                    var_11_EA = sub:int(add:int(invokestatic:int(d::a, getstatic:double(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u6c56\u8cae\uc31c\u446c\uc9f6\u873d)), var_5_80:int), xor:int(ldc:int(3072), ldc:int(3073)))
                    var_12_110 = var_14_114 = loadelement(getstatic(\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80)
                    
                    if (cmplt:boolean(var_16_118 = var_11_EA:int, var_6_87:int)) {
                        var_9_C7 = loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_11_EA:int)
                        var_16_118 = var_11_EA:int
                        var_14_114 = var_12_110:double
                    }
                }
                
                loop {
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                        goto(Label_1511)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1503723731))
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(972114484))
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(67108864)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(922196095))
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(755655348))
                    }
                    else {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1328467198))
                        
                        if (cmplt:boolean(var_16_118:int, var_6_87:int)) {
                            if (cmpne:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::a))) {
                                goto(Label_0571)
                            }
                            
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0407:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(475385055))
                        goto(Label_1511)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1322757802))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1901460377))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(781304786))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-23021210))
                            var_11_EA = and:int(ldc:int(29891), ldc:int(-29896))
                            goto(Label_1500)
                        }
                        
                        loopcontinue()
                    }
                    
                    Label_0571:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(121473565))
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-959067527))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1742940940))
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-746284746))
                        
                        if (cmpeq:boolean(getstatic:ao(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::i), getstatic:ao(ao::c))) {
                            var_14_114 = var_9_C7:double
                            goto(Label_0815)
                        }
                    }
                    
                    Label_0687:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-634376084))
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(262144)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(429095270))
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-233234142))
                        goto(Label_1102)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1079610858))
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8192)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8192)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-193721546))
                        var_14_114 = mul:double(ldc:double(0.5), add:double(var_9_C7:double, var_14_114:double))
                    }
                    
                    Label_0815:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(128)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-927903079))
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                        goto(Label_1102)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1390686718))
                            goto(Label_0687)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-931309356))
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-275825532))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1671770442))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-315986690))
                        
                        if (cmpeq:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::b))) {
                            if (cmplt:boolean(loadelement:double(getstatic:double[](\u9937\u071d\ub19c\u6c56\ua562\uc87f::\u2dcc\u3776\ub171\u516c\u56bd\uc7fe), var_5_80:int), var_7_96:double)) {
                                var_11_EA = and:int(ldc:int(8197), ldc:int(4755))
                                goto(Label_1102)
                            }
                        }
                    }
                    
                    Label_0944:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32)), ldc:int(0))) {
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-914334494))
                    }
                    else {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8192)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1611400659))
                            goto(Label_0815)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(197608010))
                            goto(Label_0687)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(2112360389))
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(128)), ldc:int(0))) {
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-29384706))
                        var_11_EA = and:int(ldc:int(20248), ldc:int(-32667))
                    }
                    
                    Label_1102:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1709439221))
                        goto(Label_1376)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(8192)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                            goto(Label_0944)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(33554432)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1932473849))
                            goto(Label_0815)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-461590882))
                            goto(Label_0687)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                            goto(Label_0571)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2147483647)), ldc:int(0))) {
                            goto(Label_0407)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(726642458))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(2032720958))
                        
                        if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                            if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                                goto(Label_1376)
                            }
                        }
                    }
                    
                    Label_1224:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1977018707))
                        goto(Label_1511)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1404793180))
                            goto(Label_1102)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32)), ldc:int(0))) {
                            goto(Label_0944)
                        }
                        
                        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-1040567516))
                            goto(Label_0815)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                            goto(Label_0687)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-301345632))
                            goto(Label_0571)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(64)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(1089178058))
                            goto(Label_0407)
                        }
                        
                        if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(67108864)), ldc:int(0))) {
                            var_3_64B = and:int(var_3_64B:int, ldc:int(-906337293))
                            loopcontinue()
                        }
                        
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1219554799))
                        invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, p0:\uae87\u3bc9\u3bc9\u7049\uc246\u3e75, var_14_114:double, var_5_80:int, var_16_118:int)
                        goto(Label_1500)
                    }
                    
                    Label_1376:
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_1511)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(1647984149))
                        goto(Label_1224)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(2048)), ldc:int(0))) {
                        goto(Label_1102)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(931343308))
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(33554432)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-605750751))
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(128)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                        loopcontinue()
                    }
                    
                    var_3_64B = and:int(var_3_64B:int, ldc:int(-580666074))
                    invokestatic:void(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::\u0800\u2dcc\uc4d2\u8aa5\u4cd9\u51b2, invokestatic:boolean(\uae87\u3bc9\u3bc9\u7049\uc246\u3e75::\u0a06\u59ec\u93a2\u9937\ub83f\ub171), var_14_114:double, ldc:double(0.0))
                    Label_1500:
                    
                    if (cmpne:boolean(getstatic:ap(\u7049\ucfaf\u4c2b\u74b1\u69d9\uf9c5::a), getstatic:ap(ap::a))) {
                        var_17_656 = var_5_80:int
                        
                        if (cmpeq:boolean(var_11_EA:int, ldc:int(0))) {
                            looporswitchbreak()
                        }
                    }
                    
                    Label_1511:
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(32768)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-2011823068))
                        goto(Label_1376)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-1831006485))
                        goto(Label_1224)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(1048576)), ldc:int(0))) {
                        goto(Label_1102)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(32)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-90844366))
                        goto(Label_0944)
                    }
                    
                    if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(1073741824)), ldc:int(0))) {
                        goto(Label_0815)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4194304)), ldc:int(0))) {
                        goto(Label_0687)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(33554432)), ldc:int(0))) {
                        goto(Label_0571)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(8192)), ldc:int(0))) {
                        goto(Label_0407)
                    }
                    
                    if (cmpne:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
                        var_3_64B = and:int(var_3_64B:int, ldc:int(-548451418))
                        var_17_656 = add:int(var_16_118:int, and:int(ldc:int(2309), ldc:int(20491)))
                        looporswitchbreak()
                    }
                }
                
                var_3_64B = and:int(var_3_64B:int, ldc:int(1246345599))
                
                if (cmple:boolean(var_5_80 = var_17_656:int, sub:int(var_6_87:int, and:int(ldc:int(4611), ldc:int(37))))) {
                    loopcontinue()
                }
                
                looporswitchbreak()
            }
        }
        
        Label_0170:
        
        if (cmpeq:boolean(and:int(var_3_64B:int, ldc:int(4)), ldc:int(0))) {
            var_3_64B = and:int(var_3_64B:int, ldc:int(1275332056))
            goto(Label_0108)
        }
    }
}
